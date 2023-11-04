package com.pawesomebytes.leetcode.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N122Test {
    private final N122 systemUnderTest = new N122();
    int[] prices = {1, 2, 4, 3, 6, 4};
    int expectedProfit = 6;

    @Test
    public void shouldPass() {
        int result = systemUnderTest.maxProfit(prices);

        assertEquals(expectedProfit, result);
    }
}