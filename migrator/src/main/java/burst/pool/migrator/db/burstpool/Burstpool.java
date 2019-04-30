/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.db.burstpool;


import burst.pool.migrator.db.DefaultCatalog;
import burst.pool.migrator.db.burstpool.tables.*;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
public class Burstpool extends SchemaImpl {

    private static final long serialVersionUID = 1425085053;

    /**
     * The reference instance of <code>BURSTPOOL</code>
     */
    public static final Burstpool BURSTPOOL = new Burstpool();

    /**
     * The table <code>BURSTPOOL.BESTSUBMISSIONS</code>.
     */
    public final Bestsubmissions BESTSUBMISSIONS = Bestsubmissions.BESTSUBMISSIONS;

    /**
     * The table <code>BURSTPOOL.MINERDEADLINES</code>.
     */
    public final Minerdeadlines MINERDEADLINES = burst.pool.migrator.db.burstpool.tables.Minerdeadlines.MINERDEADLINES;

    /**
     * The table <code>BURSTPOOL.MINERS</code>.
     */
    public final Miners MINERS = burst.pool.migrator.db.burstpool.tables.Miners.MINERS;

    /**
     * The table <code>BURSTPOOL.PAYOUTS</code>.
     */
    public final Payouts PAYOUTS = burst.pool.migrator.db.burstpool.tables.Payouts.PAYOUTS;

    /**
     * The table <code>BURSTPOOL.POOLSTATE</code>.
     */
    public final Poolstate POOLSTATE = burst.pool.migrator.db.burstpool.tables.Poolstate.POOLSTATE;

    /**
     * The table <code>BURSTPOOL.WONBLOCKS</code>.
     */
    public final Wonblocks WONBLOCKS = Wonblocks.WONBLOCKS;

    /**
     * No further instances allowed
     */
    private Burstpool() {
        super("BURSTPOOL", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Bestsubmissions.BESTSUBMISSIONS,
            Minerdeadlines.MINERDEADLINES,
            Miners.MINERS,
            Payouts.PAYOUTS,
            Poolstate.POOLSTATE,
            Wonblocks.WONBLOCKS);
    }
}