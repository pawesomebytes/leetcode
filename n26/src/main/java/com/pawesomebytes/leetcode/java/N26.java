package com.pawesomebytes.leetcode.java;

public class N26 {
    public int removeDuplicates(int[] nums) {
        int currentIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[currentIndex] != nums[i]) {
                nums[++currentIndex] = nums[i];
            }
        }

        return ++currentIndex;
    }
}
