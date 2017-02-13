/*
 * This file is generated by jOOQ.
*/
package org.redlich.pubs.model.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.redlich.pubs.model.tables.Authors;


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
public class AuthorsRecord extends UpdatableRecordImpl<AuthorsRecord> implements Record7<Long, Long, String, String, Long, String, String> {

    private static final long serialVersionUID = -830367939;

    /**
     * Setter for <code>pubs.authors.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pubs.authors.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pubs.authors.version</code>.
     */
    public void setVersion(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pubs.authors.version</code>.
     */
    public Long getVersion() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pubs.authors.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pubs.authors.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pubs.authors.first_name</code>.
     */
    public void setFirstName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pubs.authors.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pubs.authors.state_id</code>.
     */
    public void setStateId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pubs.authors.state_id</code>.
     */
    public Long getStateId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pubs.authors.zip_code</code>.
     */
    public void setZipCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pubs.authors.zip_code</code>.
     */
    public String getZipCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pubs.authors.home_email</code>.
     */
    public void setHomeEmail(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pubs.authors.home_email</code>.
     */
    public String getHomeEmail() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, String, String, Long, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, String, String, Long, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Authors.AUTHORS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Authors.AUTHORS.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Authors.AUTHORS.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Authors.AUTHORS.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Authors.AUTHORS.STATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Authors.AUTHORS.ZIP_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Authors.AUTHORS.HOME_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getZipCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getHomeEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorsRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorsRecord value2(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorsRecord value3(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorsRecord value4(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorsRecord value5(Long value) {
        setStateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorsRecord value6(String value) {
        setZipCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorsRecord value7(String value) {
        setHomeEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorsRecord values(Long value1, Long value2, String value3, String value4, Long value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthorsRecord
     */
    public AuthorsRecord() {
        super(Authors.AUTHORS);
    }

    /**
     * Create a detached, initialised AuthorsRecord
     */
    public AuthorsRecord(Long id, Long version, String lastName, String firstName, Long stateId, String zipCode, String homeEmail) {
        super(Authors.AUTHORS);

        set(0, id);
        set(1, version);
        set(2, lastName);
        set(3, firstName);
        set(4, stateId);
        set(5, zipCode);
        set(6, homeEmail);
    }
}
