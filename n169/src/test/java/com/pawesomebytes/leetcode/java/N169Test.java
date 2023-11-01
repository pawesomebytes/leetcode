package com.pawesomebytes.leetcode.java;

import org.junit.jupiter.api.Test;

class N169Test {
    private final N169 systemUnderTest = new N169();
    int[] nums = {2,2,1,1,1,1,1,2,2};
    int expected = 1;

    @Test
    public void shouldPass() {
        int result = systemUnderTest.majorityElement(nums);

        assert expected == result;
    }
}