package com.pawesomebytes.leetcode.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N45Test {
    private final N45 systemUnderTest = new N45();
    int[] nums = {1, 4, 2, 3, 0, 0, 4};
    int expectedJumps = 3;

    @Test
    public void shouldPass() {
        int result = systemUnderTest.jump(nums);

        assertEquals(expectedJumps, result);
    }

}