package com.xceptance.loadtest.jmeter.tests;

import com.xceptance.loadtest.test.AbstractComponentTest;


public class XLTJMeterOrder extends AbstractComponentTest
{
    public XLTJMeterOrder()
    {
        useRequestMode = false;
        jmxSource = "/GuestOrder.jmx";
    } 
}