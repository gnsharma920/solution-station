package com.solution.station.searching;

public class LinearSearch {

    public static void main(String[] args){
        boolean isPresent = isValuePresentInArray(new int[]{1,2,3,4,5,6,7,8},10);

        System.out.println(isPresent);
    }

    private static boolean isValuePresentInArray(int[] ints, int targetValue) {
        for (int value : ints) {
            if (value == targetValue) {
                return true;
            }
        }
        return false;
    }
}
