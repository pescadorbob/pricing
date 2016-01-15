package com.fmr.xtrac.pricing;

import com.cds.pricing.CDSPricer;
import com.fmr.xtrac.framework.Framework;

public class Pricing extends Framework {

    CDSPricer cdsPricer = new CDSPricer();

    public String printSomething() {
        return "Pricing of DDD:"+cdsPricer.getPrice("DDD");
    }
}
