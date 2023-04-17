package com.solution.station.array.easy;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getReverseArray(new int[]{10, 0, 20, 30, 40})));
        System.out.println(Arrays.toString(getReverseArray(new int[]{11, 0, 21, 30, 60, 40, 30, 40})));
    }

    public static int[] getReverseArray(int num[]) {
        int low = 0, high = num.length - 1;
        while (low < high) {
            int temp = num[low];
            num[low] = num[high];
            num[high] = temp;
            low++;
            high--;
        }
        return num;
    }
}
