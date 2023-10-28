package com.pawesomebytes.leetcode.java;

public class N88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1CurrentIndex = m - 1;
        int nums2CurrentIndex = n - 1;
        int currentIndex = m + n - 1;

        while (nums2CurrentIndex >= 0) {
            if (nums1CurrentIndex >= 0 && nums1[nums1CurrentIndex] > nums2[nums2CurrentIndex]) {
                nums1[currentIndex] = nums1[nums1CurrentIndex--];
            } else {
                nums1[currentIndex] = nums2[nums2CurrentIndex--];
            }

            currentIndex--;
        }
    }
}
