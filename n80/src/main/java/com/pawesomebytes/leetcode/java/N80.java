package com.pawesomebytes.leetcode.java;

public class N80 {
    public int removeDuplicates(int[] nums) {
        int currentIndex = 1;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[currentIndex] || nums[i] != nums[currentIndex - 1]) {
                nums[++currentIndex] = nums[i];
            }
        }
        return ++currentIndex;
    }
}
