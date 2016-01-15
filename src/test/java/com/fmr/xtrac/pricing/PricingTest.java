package com.fmr.xtrac.pricing;

import junit.framework.TestCase;

public class PricingTest extends TestCase {

    public void testPrintSomething() throws Exception {
        Pricing pricing = new Pricing();
        assertEquals("Pricing",pricing.execute());
    }
}