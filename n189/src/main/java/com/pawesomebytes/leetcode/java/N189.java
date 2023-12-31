package com.pawesomebytes.leetcode.java;

public class N189 {
    public void rotate(int[] nums, int k) {
        int shift = k % nums.length;

        int[] tempArray = nums.clone();

        for (int i = 0; i < shift; i++) {
            nums[i] = tempArray[nums.length - shift + i];
        }

        for (int i = shift; i < nums.length; i++) {
            nums[i] = tempArray[i - shift];
        }
    }

    public void rotate2(int[] nums, int k) {
        int shift = k % nums.length;

        for (int i = 0; i < shift; i++) {
            int temp = nums[0];
            for (int j = 1; j < nums.length; j++) {
                int innerTemp = nums[j];
                nums[j] = temp;
                temp = innerTemp;
            }
            nums[0] = temp;
        }
    }

    public void rotate3(int[] nums, int k) {
        int shift = k % nums.length;

        flip(nums, 0, nums.length - 1);
        flip(nums, 0, shift - 1);
        flip(nums, shift, nums.length - 1);

    }

    private void flip(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
