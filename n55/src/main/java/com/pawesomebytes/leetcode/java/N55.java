package com.pawesomebytes.leetcode.java;

public class N55 {
    public boolean canJump(int[] nums) {
        int reachableIndex = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > reachableIndex) {
                break;
            }

            reachableIndex = Math.max(reachableIndex, i + nums[i]);
        }

        return reachableIndex >= nums.length - 1;
    }
}