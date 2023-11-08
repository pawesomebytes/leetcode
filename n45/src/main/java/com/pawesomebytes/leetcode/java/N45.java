package com.pawesomebytes.leetcode.java;

public class N45 {
    public int jump(int[] nums) {
        int i = nums.length - 1;
        int steps = 0;

        while (i > 0) {
            int maxJumpIndex = 0;

            for (int j = i - 1; j >= 0; j--) {
                if (j + nums[j] >= i) {
                    maxJumpIndex = j;
                }
            }

            i = maxJumpIndex;
            steps++;
        }

        return steps;
    }
}
