package com.solution.station.searching;



public class BinarySearch {
    public static void main(String[] args){
        int[] array = new int[]{8,7,6,5,4,3,2,1};
        int startingIndex=0;
        int endingIndex=array.length-1;
        int targetValue=6;
        int index = isValuePresent(array,startingIndex,endingIndex,targetValue,false);

        System.out.println(index);
    }

    private static int isValuePresent(int[] array, int startingIndex, int endingIndex, int targetValue, boolean isInAscendingOrder) {
        int midIndex= (startingIndex+endingIndex)/2;
        if(startingIndex == array.length || endingIndex == -1){
            return -1;
        }
        if(isInAscendingOrder){
            if(array[midIndex] == targetValue){
                return midIndex;
            } else if(array[midIndex] > targetValue){
                endingIndex=midIndex-1;
                return isValuePresent(array,startingIndex,endingIndex,targetValue,true);
            } else if(array[midIndex] < targetValue) {
                startingIndex = midIndex + 1;
                return isValuePresent(array, startingIndex, endingIndex, targetValue,true);
            }
        } else {
                if(array[midIndex] == targetValue){
                    return midIndex;
                } else if(array[midIndex] < targetValue){
                    endingIndex=midIndex-1;
                    return isValuePresent(array,startingIndex,endingIndex,targetValue,false);
                } else if(array[midIndex] > targetValue) {
                    startingIndex = midIndex + 1;
                    return isValuePresent(array, startingIndex, endingIndex, targetValue,false);
                }
        }

        return -1;
    }
}
