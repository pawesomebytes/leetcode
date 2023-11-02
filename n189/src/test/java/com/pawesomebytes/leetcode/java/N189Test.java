package com.pawesomebytes.leetcode.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N189Test {
    private final N189 systemUnderTest = new N189();
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;
    int[] expectedNums = {5, 6, 7, 1, 2, 3, 4};

    @Test
    public void shouldPass() {
        systemUnderTest.rotate(nums, k);

        assertArrayEquals(expectedNums, nums);
    }

    @Test
    public void shouldPass2Approach() {
        systemUnderTest.rotate2(nums, k);

        assertArrayEquals(expectedNums, nums);
    }

    @Test
    public void shouldPass3Approach() {
        systemUnderTest.rotate3(nums, k);

        assertArrayEquals(expectedNums, nums);
    }
}
