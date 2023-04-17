package com.solution.station.array.easy;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println("Size of array without duplicat element: " + removeDuplicateFromSortedArray(new int[]{10, 20, 20, 30, 30, 30, 40, 40, 50}));
    }

    public static int removeDuplicateFromSortedArray(int nums[]) {
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[result - 1]) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
//        int[] temp = new int[nums.length];
//        temp[0] = nums[0];
//        int indexOfTemp = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (i == nums.length - 1) {
//                if (nums[i] != nums[i - 1]) {
//                    temp[indexOfTemp] = nums[i];
//                    indexOfTemp++;
//                }
//                return indexOfTemp;
//            } else if (nums[i] != nums[i + 1]) {
//                temp[indexOfTemp] = nums[i];
//                indexOfTemp++;
//            }
//        }
//        return indexOfTemp;
//    }
}
