/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.mysql.tables;


import burst.pool.migrator.nogroddb.mysql.Indexes;
import burst.pool.migrator.nogroddb.mysql.Keys;
import burst.pool.migrator.nogroddb.mysql.Mysql;
import burst.pool.migrator.nogroddb.mysql.enums.RolesMappingAdminOption;
import burst.pool.migrator.nogroddb.mysql.tables.records.RolesMappingRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
 * Granted roles
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RolesMapping extends TableImpl<RolesMappingRecord> {

    private static final long serialVersionUID = -462271171;

    /**
     * The reference instance of <code>mysql.roles_mapping</code>
     */
    public static final RolesMapping ROLES_MAPPING = new RolesMapping();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RolesMappingRecord> getRecordType() {
        return RolesMappingRecord.class;
    }

    /**
     * The column <code>mysql.roles_mapping.Host</code>.
     */
    public final TableField<RolesMappingRecord, String> HOST = createField("Host", org.jooq.impl.SQLDataType.CHAR(60).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.roles_mapping.User</code>.
     */
    public final TableField<RolesMappingRecord, String> USER = createField("User", org.jooq.impl.SQLDataType.CHAR(80).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.roles_mapping.Role</code>.
     */
    public final TableField<RolesMappingRecord, String> ROLE = createField("Role", org.jooq.impl.SQLDataType.CHAR(80).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.roles_mapping.Admin_option</code>.
     */
    public final TableField<RolesMappingRecord, RolesMappingAdminOption> ADMIN_OPTION = createField("Admin_option", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.field("'N'", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(burst.pool.migrator.nogroddb.mysql.enums.RolesMappingAdminOption.class), this, "");

    /**
     * Create a <code>mysql.roles_mapping</code> table reference
     */
    public RolesMapping() {
        this(DSL.name("roles_mapping"), null);
    }

    /**
     * Create an aliased <code>mysql.roles_mapping</code> table reference
     */
    public RolesMapping(String alias) {
        this(DSL.name(alias), ROLES_MAPPING);
    }

    /**
     * Create an aliased <code>mysql.roles_mapping</code> table reference
     */
    public RolesMapping(Name alias) {
        this(alias, ROLES_MAPPING);
    }

    private RolesMapping(Name alias, Table<RolesMappingRecord> aliased) {
        this(alias, aliased, null);
    }

    private RolesMapping(Name alias, Table<RolesMappingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Granted roles"));
    }

    public <O extends Record> RolesMapping(Table<O> child, ForeignKey<O, RolesMappingRecord> key) {
        super(child, key, ROLES_MAPPING);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ROLES_MAPPING_HOST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RolesMappingRecord>> getKeys() {
        return Arrays.<UniqueKey<RolesMappingRecord>>asList(Keys.KEY_ROLES_MAPPING_HOST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolesMapping as(String alias) {
        return new RolesMapping(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolesMapping as(Name alias) {
        return new RolesMapping(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RolesMapping rename(String name) {
        return new RolesMapping(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RolesMapping rename(Name name) {
        return new RolesMapping(name, null);
    }
}