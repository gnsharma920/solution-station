package com.solution.station.array.medium;


import java.util.Map;

public class ProductOfArrayExceptSelf {
//    public static int[] productExceptSelf(int[] nums) {
//        int[] result = new int[nums.length];
//
//        return result;
//    }
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product=1,toEnd=i+1, toStart=i-1;
            while(toStart>=0){
                product*=nums[toStart];
                toStart--;
            }
            while(toEnd<nums.length){
                product*=nums[toEnd];
                toEnd++;
            }
            result[i]=product;
        }
        return result;
    }
//    public static int[] productExceptSelf(int[] nums) {
//        int[] result = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int product = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if (i != j) {
//                    product *= nums[j];
//                }
//            }
//            result[i] = product;
//        }
//        return result;
//    }

    public static void main(String[] args) {
        for(int i: productExceptSelf(new int[]{1,2,0,4})){
            System.out.print(i+", ");
        }
    }
}
