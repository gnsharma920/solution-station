package com.solution.station.sorting;

public class InsertionSort {
    public static void main(String arg[]){
        int[] array = new int[]{56,-34,67,56,43,100,30,10000,40};
        int[] sortedArray = sortArray(array);
        for (int i:sortedArray){
            System.out.println(i);
        }
    }

    public static int[] sortArray(int[] array){
        for(int i=1;i<array.length;i++){
            int j= i-1;
            int temp= array[i];
            for(;j>=0; j--){
                if(array[j] > temp ){
                    array[j+1] =array[j];
                } else {
                    break;
                }
            }
            array[j+1] = temp;
        }
        return array;
    }
}
