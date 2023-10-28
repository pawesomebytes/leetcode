package com.pawesomebytes.leetcode.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N27Test {
    private final N27 systemUnderTest = new N27();
    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
    int val = 2;

    int[] expectedNums = {0, 1, 3, 0, 4, 0, 4, 2};
    int expectedVal = 5;

    @Test
    public void shouldPass() {
        int result = systemUnderTest.removeElement(nums, val);

        assertArrayEquals(expectedNums, nums);
        assert expectedVal == result;
    }
}
