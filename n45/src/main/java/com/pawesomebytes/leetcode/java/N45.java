package com.pawesomebytes.leetcode.java;

public class N45 {
    public int jump(int[] nums) {
        int steps = 0;
        int currentMaxReachableIndex = 0;
        int currentEndIndex = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            currentMaxReachableIndex = Math.max(currentMaxReachableIndex, nums[i] + i);

            if (i == currentEndIndex) {
                steps++;
                currentEndIndex = currentMaxReachableIndex;
            }
        }

        return steps;
    }
}
