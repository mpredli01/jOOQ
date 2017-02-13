package org.redlich.pubs;

import java.util.Date;
import java.util.Calendar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Timestamp;

import org.jooq.Record;
import org.jooq.Result;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static org.redlich.pubs.model.Tables.*;

public class Application {
    public static void main(String[] args) throws Exception {

        Application application = new Application();

        String user = System.getProperty("jdbc.user");
        String password = System.getProperty("jdbc.password");
        String url = System.getProperty("jdbc.url");
        String driver = System.getProperty("jdbc.driver");

        // data for inserting a new row in the publications table...
        final String pubTitle = "Netflix Introduces Hollow, a Java Library for Processing In-Memory Datasets";
        final String pubUrl = "https://www.infoq.com/news/2017/01/netflix-introduces-hollow";
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2017);
        calendar.set(Calendar.MONTH,Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH,31);

        Class.forName(driver).newInstance();
        try(Connection connection = DriverManager.getConnection(url,user,password)) {
            DSLContext dslContext = DSL.using(connection,SQLDialect.MYSQL);
            long count = DSL.using(connection,SQLDialect.MYSQL)
                    .selectCount()
                    .from(PUBLICATIONS)
                    .fetchOne(0,int.class); // get the number of current rows in the publications table...
            application.getPublicationsResultSet(dslContext);
            application.getAuthorResultSet(dslContext);
            application.insertRow(dslContext,pubTitle,pubUrl,++count,calendar);
            }
        catch(Exception exception) {
            exception.printStackTrace();
            }
        }

    public void getPublicationsResultSet(DSLContext context) {
        Result<Record> result = context.select()
                .from(PUBLICATIONS)
                .join(AUTHORS)
                .on(AUTHORS.ID.equal(PUBLICATIONS.AUTHOR_ID))
                .join(TYPES)
                .on(TYPES.ID.equal(PUBLICATIONS.TYPE_ID))
                .join(PUBLISHERS)
                .on(PUBLISHERS.ID.equal(PUBLICATIONS.PUBLISHER_ID))
                .fetch();

        System.out.println("Publications List:\n");
        for(Record record : result) {
            Long id = record.getValue(PUBLICATIONS.ID);
            String title = record.getValue(PUBLICATIONS.TITLE);
            Long authorID = record.getValue(PUBLICATIONS.AUTHOR_ID);
            String lastName = record.getValue(AUTHORS.LAST_NAME);
            String firstName = record.getValue(AUTHORS.FIRST_NAME);
            String type = record.getValue(TYPES.TYPE);
            String publisher = record.getValue(PUBLISHERS.PUBLISHER);
            Date publishDate = record.getValue(PUBLICATIONS.PUBLISH_DATE);
            String url = record.getValue(PUBLICATIONS.URL);

            System.out.println("type: " + type);
            System.out.println("id: " + id + ", title: " + title);
            System.out.println("authorID: " + authorID + ", author: " + firstName + " " + lastName);
            System.out.println("publisher: " + publisher);
            System.out.println("publish date: " + publishDate);
            System.out.println("url: " + url);
            System.out.println("\n");
            }
        }

    public void getAuthorResultSet(DSLContext context) {
        Result<Record> result = context.select()
                .from(AUTHORS)
                .join(STATES)
                .on(STATES.ID.equal(AUTHORS.STATE_ID))
                .fetch();

        System.out.println("About the Authors:\n");
        for(Record record : result) {
            Long id = record.getValue(AUTHORS.ID);
            String lastName = record.getValue(AUTHORS.LAST_NAME);
            String firstName = record.getValue(AUTHORS.FIRST_NAME);
            String state = record.getValue(STATES.STATE);
            String zipCode = record.getValue(AUTHORS.ZIP_CODE);
            String email = record.getValue(AUTHORS.HOME_EMAIL);

            System.out.println(firstName + " " + lastName);
            System.out.println(state + " " + zipCode);
            System.out.println();
            }
        }

    public void insertRow(DSLContext context,String title,String url,long count,Calendar calendar) {
        Date date = calendar.getTime();
        Timestamp timestamp = new Timestamp(date.getTime());

        System.out.println("Inserting a new row into the database:");
        System.out.println("id: " + count);
        System.out.println("title: " + title);
        System.out.println("publish date: " + timestamp);
        System.out.println("url: " + url);

        context.insertInto(PUBLICATIONS,PUBLICATIONS.ID,PUBLICATIONS.VERSION,PUBLICATIONS.TYPE_ID,PUBLICATIONS.TITLE,PUBLICATIONS.AUTHOR_ID,PUBLICATIONS.PUBLISHER_ID,PUBLICATIONS.PUBLISH_DATE,PUBLICATIONS.URL)
                .values(count,0L,1L,title,1L,2L,timestamp,url)
                .execute();
        }
    }
