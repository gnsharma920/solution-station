package com.solution.station.array.easy;

//Maximum Difference problem is to find the maximum of arr[j] - arr[i] where j>i.
public class MaximumDifferenceProblemWithOrder {

    public static void main(String[] args) {
        System.out.println(maxDifference(new int[]{2, 3, 10, 6, 4, 8, 1}));
        System.out.println(maxDifference(new int[]{10, 20, 30}));
        System.out.println(maxDifference(new int[]{7, 9, 5, 6, 3, 2}));
        System.out.println(maxDifference(new int[]{30, 10, 8, 2}));
    }

    private static int maxDifference(int num[]) {
        int maxDiff = Integer.MIN_VALUE;
        int minValue = num[0];
        for (int i = 1; i < num.length; i++) {
            maxDiff = Math.max(num[i] - minValue, maxDiff);
            minValue = Math.min(minValue, num[i]);
        }
        return maxDiff;
    }


}
