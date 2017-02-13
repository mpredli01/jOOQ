/*
 * This file is generated by jOOQ.
*/
package org.redlich.pubs.model.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.redlich.pubs.model.Keys;
import org.redlich.pubs.model.Pubs;
import org.redlich.pubs.model.tables.records.TypesRecord;


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
public class Types extends TableImpl<TypesRecord> {

    private static final long serialVersionUID = 1468890259;

    /**
     * The reference instance of <code>pubs.types</code>
     */
    public static final Types TYPES = new Types();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TypesRecord> getRecordType() {
        return TypesRecord.class;
    }

    /**
     * The column <code>pubs.types.id</code>.
     */
    public final TableField<TypesRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pubs.types.version</code>.
     */
    public final TableField<TypesRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pubs.types.type</code>.
     */
    public final TableField<TypesRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * Create a <code>pubs.types</code> table reference
     */
    public Types() {
        this("types", null);
    }

    /**
     * Create an aliased <code>pubs.types</code> table reference
     */
    public Types(String alias) {
        this(alias, TYPES);
    }

    private Types(String alias, Table<TypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Types(String alias, Table<TypesRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TypesRecord, Long> getIdentity() {
        return Keys.IDENTITY_TYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TypesRecord> getPrimaryKey() {
        return Keys.KEY_TYPES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TypesRecord>> getKeys() {
        return Arrays.<UniqueKey<TypesRecord>>asList(Keys.KEY_TYPES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Types as(String alias) {
        return new Types(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Types rename(String name) {
        return new Types(name, null);
    }
}
