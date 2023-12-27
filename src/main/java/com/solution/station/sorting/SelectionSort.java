package com.solution.station.sorting;

public class SelectionSort {

    public static void main(String arg[]){
        int[] array = new int[]{2,3,4,5,6,1,5,0};
        int[] sortedArray = sortArray(array,true);
        for (int i:sortedArray){
            System.out.println(i);
        }
    }

    public static int[] sortArray(int[] array,boolean isAscendingOrder){
        int i=0;
        while(i < array.length){
            int minIndex = i;
            for(int j=i; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex=j;
                }
            }
            int temp=array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            i++;
        }
        return array;
    }
}
