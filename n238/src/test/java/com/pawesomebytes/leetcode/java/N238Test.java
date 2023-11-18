package com.pawesomebytes.leetcode.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N238Test {
    private final N238 systemUnderTest = new N238();
    int[] nums = {1, 2, 3, 4};
    int[] expected = {24,12,8,6};

    @Test
    public void shouldPass() {
        int[] result = systemUnderTest.productExceptSelf(nums);

        assertArrayEquals(expected, result);
    }
}
