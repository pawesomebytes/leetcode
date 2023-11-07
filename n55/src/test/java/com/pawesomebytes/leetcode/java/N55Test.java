package com.pawesomebytes.leetcode.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N55Test {
    private final N55 systemUnderTest = new N55();
    int[] nums = {1, 2, 3, 0, 0, 4};
    boolean reachable = true;

    @Test
    public void shouldPass() {
        boolean result = systemUnderTest.canJump(nums);

        assertEquals(reachable, result);
    }

}