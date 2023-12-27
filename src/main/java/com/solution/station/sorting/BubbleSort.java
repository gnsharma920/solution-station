package com.solution.station.sorting;

public class BubbleSort {
    public static void main(String arg[]){
        int[] array = new int[]{56,-34,67,56,43,100,30,10000,40};
        int[] sortedArray = sortArray(array);
        for (int i:sortedArray){
            System.out.println(i);
        }
    }

    public static int[] sortArray(int[] array){
        int i = array.length-1;
        while(i > 0){
            for(int j=0; j<i; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            i--;
        }
        return array;
    }
}


