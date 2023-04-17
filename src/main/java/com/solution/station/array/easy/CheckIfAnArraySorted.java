package com.solution.station.array.easy;

public class CheckIfAnArraySorted {
    public static void main(String[] args) {
        System.out.println(isSortedArray(new int[]{1, 2, 3, 4, 5, 6, 7}));
        System.out.println(isSortedArray(new int[]{1, 2, 6, 4, 5, 6, 7}));
        System.out.println(isSortedArray(new int[]{1, 2, 4, 4, 5, 6, 7}));
        System.out.println(isSortedArray(new int[]{0, 2, 3, 4, 5, 6, 7}));
    }

    public static boolean isSortedArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
