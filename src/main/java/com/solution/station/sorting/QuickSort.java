package com.solution.station.sorting;

public class QuickSort {

    public static void main(String arg[]) {
        int[] array = new int[]{2, 3, 4, 5, 6, 1, 5, 0};
        sortArray(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void sortArray(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int p = partition(array, startIndex, endIndex);

        sortArray(array, startIndex, p - 1);
        sortArray(array, p + 1, endIndex);
    }

    private static int partition(int[] array, int startIndex, int endIndex) {
        int pivot = array[startIndex];
        int count = 0;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (array[i] <= pivot) {
                count++;
            }
        }
        int pivotIndex = startIndex + count;
        int temp = array[startIndex];
        array[startIndex] = array[pivotIndex];
        array[pivotIndex] = temp;

        int i = startIndex, j = endIndex;
        while (i < pivotIndex && j > pivotIndex) {
            while (array[i] <= pivot) {
                i++;
            }

            while (array[j] >= pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                int temp1 = array[i];
                array[i] = array[j];
                array[j] = temp1;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
}
