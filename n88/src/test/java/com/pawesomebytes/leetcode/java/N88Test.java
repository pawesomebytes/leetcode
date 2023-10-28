package com.pawesomebytes.leetcode.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N88Test {
    private final N88 systemUnderTest = new N88();
    private final int[] expected = {1, 2, 3, 4, 5};

    @Test
    public void shouldPassTest() {
        int m = 3;
        int n = 2;
        int[] nums1 = {1, 2, 4, 0, 0};
        int[] nums2 = {3, 5};

        systemUnderTest.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }
}