package com.pawesomebytes.leetcode.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N121Test {
    private final N121 systemUnderTest = new N121();
    int[] prices = {1, 2, 4, 3, 6, 4};
    int expectedProfit = 5;

    @Test
    public void shouldPass() {
        int result = systemUnderTest.maxProfit(prices);

        assertEquals(expectedProfit, result);
    }
}