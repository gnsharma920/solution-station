package com.solution.station.array.easy;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRotateArrayByOne(new int[]{1, 2, 3, 5, 6, 7, 8, 9})));
    }

    // time: o(n) space: o(1)
    public static int[] leftRotateArrayByOne(int num[]) {
        int lastValue = num[0];
        for (int i = 1; i < num.length; i++) {
            num[i - 1] = num[i];
        }
        num[num.length - 1] = lastValue;
        return num;
    }

    // time: o(n) space: o(n)
//    public static int[] leftRotateArrayByOne(int num[]){
//        int[] tempArray= new int[num.length];
//        int firstValue=num[0];
//        tempArray[num.length-1]=firstValue;
//        for(int i=0;i<num.length-1;i++){
//            tempArray[i]=num[i+1];
//        }
//        return tempArray;
//    }
}
