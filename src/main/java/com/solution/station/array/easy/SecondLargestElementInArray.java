package com.solution.station.array.easy;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        System.out.println(getSecondLargestElement(new int[]{1, 4, 3, 6, 8, 5, 3, 10, 2, 11, 6, 11, 4}));
        System.out.println(getSecondLargestElement(new int[]{10, 8}));
        System.out.println(getSecondLargestElement(new int[]{10, 10, 10}));
    }

    private static int getSecondLargestElement(int[] nums) {
        int secondLargestElement = Integer.MIN_VALUE;
        int firstLargestElement = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (firstLargestElement < nums[i]) {
                secondLargestElement = firstLargestElement;
                firstLargestElement = nums[i];
            } else if (firstLargestElement != nums[i] && secondLargestElement < nums[i]) {
                secondLargestElement = nums[i];
            }

        }
        return secondLargestElement == Integer.MIN_VALUE ? -1 : secondLargestElement;
    }
}
