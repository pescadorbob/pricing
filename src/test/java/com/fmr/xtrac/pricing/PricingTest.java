package com.fmr.xtrac.pricing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PricingTest  {

    @Test
    public void testPrintSomething() throws Exception {
        Pricing pricing = new Pricing();
        assertEquals("Pricing of DDD:405.0",pricing.execute());
    }
}