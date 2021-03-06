/*
 * This file is generated by jOOQ.
*/
package org.redlich.pubs.model.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.redlich.pubs.model.Keys;
import org.redlich.pubs.model.Pubs;
import org.redlich.pubs.model.tables.records.AuthorsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Authors extends TableImpl<AuthorsRecord> {

    private static final long serialVersionUID = 1133441823;

    /**
     * The reference instance of <code>pubs.authors</code>
     */
    public static final Authors AUTHORS = new Authors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorsRecord> getRecordType() {
        return AuthorsRecord.class;
    }

    /**
     * The column <code>pubs.authors.id</code>.
     */
    public final TableField<AuthorsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pubs.authors.version</code>.
     */
    public final TableField<AuthorsRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pubs.authors.last_name</code>.
     */
    public final TableField<AuthorsRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>pubs.authors.first_name</code>.
     */
    public final TableField<AuthorsRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>pubs.authors.state_id</code>.
     */
    public final TableField<AuthorsRecord, Long> STATE_ID = createField("state_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pubs.authors.zip_code</code>.
     */
    public final TableField<AuthorsRecord, String> ZIP_CODE = createField("zip_code", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");

    /**
     * The column <code>pubs.authors.home_email</code>.
     */
    public final TableField<AuthorsRecord, String> HOME_EMAIL = createField("home_email", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>pubs.authors</code> table reference
     */
    public Authors() {
        this("authors", null);
    }

    /**
     * Create an aliased <code>pubs.authors</code> table reference
     */
    public Authors(String alias) {
        this(alias, AUTHORS);
    }

    private Authors(String alias, Table<AuthorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Authors(String alias, Table<AuthorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Pubs.PUBS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AuthorsRecord, Long> getIdentity() {
        return Keys.IDENTITY_AUTHORS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthorsRecord> getPrimaryKey() {
        return Keys.KEY_AUTHORS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthorsRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthorsRecord>>asList(Keys.KEY_AUTHORS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AuthorsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AuthorsRecord, ?>>asList(Keys.FKD9771048E2C4D1AB);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Authors as(String alias) {
        return new Authors(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Authors rename(String name) {
        return new Authors(name, null);
    }
}
