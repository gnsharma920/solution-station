package com.solution.station.array.easy;

public class LargestElementInArray {

    public static int getLargestElement(int nums[]){
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (largestElement < nums[i]) {
                largestElement = nums[i];
            }
        }
        return largestElement;
    }
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 10, 4, 35, 6, 25};
        System.out.println(getLargestElement(array));
    }
}
