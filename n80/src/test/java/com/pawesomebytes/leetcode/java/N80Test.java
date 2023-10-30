package com.pawesomebytes.leetcode.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N80Test {
    private final N80 systemUnderTest = new N80();
    int[] nums = {1, 1, 1, 2, 2, 3};
    int[] expectedNums = {1, 1, 2, 2, 3, 3};
    int expectedK = 5;

    @Test
    public void shouldPass() {
        int result = systemUnderTest.removeDuplicates(nums);

        assertArrayEquals(expectedNums, nums);
        assert expectedK == result;
    }
}