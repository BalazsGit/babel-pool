/*
 * This file is generated by jOOQ.
 */
package burst.pool.db.tables;


import burst.pool.db.DefaultSchema;
import burst.pool.db.Indexes;
import burst.pool.db.Keys;
import burst.pool.db.tables.records.MinersRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Miners extends TableImpl<MinersRecord> {

    private static final long serialVersionUID = -1457120187;

    /**
     * The reference instance of <code>miners</code>
     */
    public static final Miners MINERS = new Miners();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MinersRecord> getRecordType() {
        return MinersRecord.class;
    }

    /**
     * The column <code>miners.db_id</code>.
     */
    public final TableField<MinersRecord, Long> DB_ID = createField("db_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>miners.account_id</code>.
     */
    public final TableField<MinersRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>miners.pending_balance</code>.
     */
    public final TableField<MinersRecord, Double> PENDING_BALANCE = createField("pending_balance", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>miners.estimated_capacity</code>.
     */
    public final TableField<MinersRecord, Double> ESTIMATED_CAPACITY = createField("estimated_capacity", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>miners.share</code>.
     */
    public final TableField<MinersRecord, Double> SHARE = createField("share", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>miners.minimum_payout</code>.
     */
    public final TableField<MinersRecord, Double> MINIMUM_PAYOUT = createField("minimum_payout", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>miners.name</code>.
     */
    public final TableField<MinersRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>miners.user_agent</code>.
     */
    public final TableField<MinersRecord, String> USER_AGENT = createField("user_agent", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * Create a <code>miners</code> table reference
     */
    public Miners() {
        this(DSL.name("miners"), null);
    }

    /**
     * Create an aliased <code>miners</code> table reference
     */
    public Miners(String alias) {
        this(DSL.name(alias), MINERS);
    }

    /**
     * Create an aliased <code>miners</code> table reference
     */
    public Miners(Name alias) {
        this(alias, MINERS);
    }

    private Miners(Name alias, Table<MinersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Miners(Name alias, Table<MinersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Miners(Table<O> child, ForeignKey<O, MinersRecord> key) {
        super(child, key, MINERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MINERS_MINERS_INDEX, Indexes.MINERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MinersRecord, Long> getIdentity() {
        return Keys.IDENTITY_MINERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MinersRecord> getPrimaryKey() {
        return Keys.KEY_MINERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MinersRecord>> getKeys() {
        return Arrays.<UniqueKey<MinersRecord>>asList(Keys.KEY_MINERS_PRIMARY, Keys.KEY_MINERS_MINERS_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Miners as(String alias) {
        return new Miners(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Miners as(Name alias) {
        return new Miners(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Miners rename(String name) {
        return new Miners(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Miners rename(Name name) {
        return new Miners(name, null);
    }
}
