package com.pawesomebytes.leetcode.java;

public class N169 {
    public int majorityElement(int[] nums) {
        int value = 0;
        int weight = 0;

        for (int num : nums) {
            if (weight == 0) {
                value = num;
            }

            if (num == value) {
                weight++;
            } else {
                weight--;
            }
        }

        return value;
    }
}
