package com.pawesomebytes.leetcode.java;

import java.util.Arrays;

public class N238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] products = new int[n];
        int acc = 1;
        Arrays.fill(products, 1);

        for (int i = 0; i < n; i++) {
            products[i] = acc * products[i];
            acc = acc * nums[i];
        }

        acc = 1;

        for (int i = n - 1; i >= 0; i--) {
            products[i] = acc * products[i];
            acc = acc * nums[i];
        }

        return products;
    }
}
