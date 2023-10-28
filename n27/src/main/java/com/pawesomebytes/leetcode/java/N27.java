package com.pawesomebytes.leetcode.java;

public class N27 {
    public int removeElement(int[] nums, int val) {
        int currentIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[currentIndex++] = nums[i];
            }
        }

        return currentIndex;
    }
}
