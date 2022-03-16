package com.brad.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

    @Test
    public void testcase3() {
        Assert.assertTrue(false);
        System.out.println("testcase1");
    }

    @Test
    public void testcase4() {
        Assert.assertTrue(true);
        System.out.println("testcase1");
    }
}
