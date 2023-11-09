package com.pawesomebytes.leetcode.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N274Test {
    private final N274 systemUnderTest = new N274();
    int[] citations = {3, 0, 6, 1, 5};
    int expected = 3;

    @Test
    public void shouldPass() {
        int result = systemUnderTest.hIndex(citations);

        assertEquals(expected, result);
    }
}