package com.solution.station.array.easy;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(new int[]{10, 0, 20, 20, 30, 0, 0, 0, 90})));
    }
    //    time: o(n) and space: o(1)
    public static int[] moveZeros(int num[]) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                int temp=num[i];
                num[i]=num[count];
                num[count]=temp;
                count++;
            }
        }
        return num;
    }

//    time: o(n) and space: o(n)
//    public static int[] moveZeros(int num[]){
//        int[] temp=new int[num.length];
//        int tempIndex=0;
//        for(int i=0;i<num.length;i++){
//            if(num[i]!=0){
//                temp[tempIndex]=num[i];
//                tempIndex++;
//            }
//        }
//        return temp;
//    }

}
