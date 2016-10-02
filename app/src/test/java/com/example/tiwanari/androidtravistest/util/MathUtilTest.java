package com.example.tiwanari.androidtravistest.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tatsuya on 16/10/02.
 */
public class MathUtilTest {

    @Test
    public void testAdd() throws Exception {
        assertEquals(4, MathUtil.add(2, 2));
    }

    @Test
    public void testSubstract() throws Exception {
        assertEquals(0, MathUtil.substract(2, 2));
    }
}