package com.solution.station.array.easy;

import java.util.Arrays;

public class LeftRotateArrayElementByDPlaces {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRotateArrayByDPlaces(new int[]{1, 2, 3, 5, 6, 7, 8, 9}, 2)));
        System.out.println(Arrays.toString(leftRotateArrayByDPlaces(new int[]{1, 2, 3, 5, 6, 7, 8, 9}, 5)));
        System.out.println(Arrays.toString(leftRotateArrayByDPlaces(new int[]{1, 2, 3, 5, 6, 7, 8, 9}, 6)));
    }

    // time: o(n) space: o(1)
    private static int[] leftRotateArrayByDPlaces(int num[], int d) {
        reverse(num, 0, d - 1);
        reverse(num, d, num.length - 1);
        reverse(num, 0, num.length - 1);
        return num;
    }

    private static void reverse(int[] nums, int low, int high) {
        while(low<high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }

    //d is smaller or equal to num of elements
    // time: o(n) space: o(n)
//    public static int[] leftRotateArrayByDPlaces(int num[], int d) {
//        int[] tempArray = new int[d];
//        for (int i = 0; i < d; i++) {
//            tempArray[i] = num[i];
//        }
//        for (int i = d; i < num.length; i++) {
//            num[i - d] = num[i];
//        }
//        for (int i = 0; i < d; i++) {
//            num[num.length - d + i] = tempArray[i];
//        }
//        return num;
//    }
}
