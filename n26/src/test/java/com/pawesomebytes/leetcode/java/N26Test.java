package com.pawesomebytes.leetcode.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N26Test {
    private final N26 systemUnderTest = new N26();
    private final int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    private final int[] expectedNums = {0, 1, 2, 3, 4, 2, 2, 3, 3, 4};
    private final int expectedK = 5;

    @Test
    public void shouldPass() {
        int k = systemUnderTest.removeDuplicates(nums);

        assertEquals(expectedK, k);
        assertArrayEquals(expectedNums, nums);
    }

}