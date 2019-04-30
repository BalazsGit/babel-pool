/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.db.burstpool;


import burst.pool.migrator.db.burstpool.tables.*;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in BURSTPOOL
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>BURSTPOOL.BESTSUBMISSIONS</code>.
     */
    public static final Bestsubmissions BESTSUBMISSIONS = Bestsubmissions.BESTSUBMISSIONS;

    /**
     * The table <code>BURSTPOOL.MINERDEADLINES</code>.
     */
    public static final Minerdeadlines MINERDEADLINES = Minerdeadlines.MINERDEADLINES;

    /**
     * The table <code>BURSTPOOL.MINERS</code>.
     */
    public static final Miners MINERS = burst.pool.migrator.db.burstpool.tables.Miners.MINERS;

    /**
     * The table <code>BURSTPOOL.PAYOUTS</code>.
     */
    public static final Payouts PAYOUTS = Payouts.PAYOUTS;

    /**
     * The table <code>BURSTPOOL.POOLSTATE</code>.
     */
    public static final Poolstate POOLSTATE = burst.pool.migrator.db.burstpool.tables.Poolstate.POOLSTATE;

    /**
     * The table <code>BURSTPOOL.WONBLOCKS</code>.
     */
    public static final Wonblocks WONBLOCKS = Wonblocks.WONBLOCKS;
}