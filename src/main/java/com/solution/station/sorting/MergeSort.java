package com.solution.station.sorting;

public class MergeSort {

    public static void main(String arg[]) {
        int[] array = new int[]{56, -34, 67, 56, 43, 100, 30, 10000, 40};
        mergeSort(array, 0, (array.length - 1));
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int midIndex = (startIndex + endIndex) / 2;

        mergeSort(array, startIndex, midIndex);
        mergeSort(array, midIndex + 1, endIndex);

        merge(array, startIndex, endIndex);
    }

    public static void merge(int[] array, int startIndex, int endIndex) {
        int midIndex = (startIndex + endIndex) / 2;

        int len1 = midIndex + 1 - startIndex;
        int len2 = endIndex - midIndex;

        int[] firstArray = new int[len1];
        int[] secondArray = new int[len2];

        int mergeArrayIndex = startIndex;

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = array[mergeArrayIndex++];
        }

        mergeArrayIndex = midIndex + 1;
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = array[mergeArrayIndex++];
        }

        int index1 = 0;
        int index2 = 0;

        mergeArrayIndex = startIndex;

        while (index1 < len1 && index2 < len2) {
            if (firstArray[index1] < secondArray[index2]) {
                array[mergeArrayIndex++] = firstArray[index1++];
            } else {
                array[mergeArrayIndex++] = secondArray[index2++];
            }
        }

        while (index1 < len1) {
            array[mergeArrayIndex++] = firstArray[index1++];
        }

        while (index2 < len2) {
            array[mergeArrayIndex++] = secondArray[index2++];
        }
    }


}
