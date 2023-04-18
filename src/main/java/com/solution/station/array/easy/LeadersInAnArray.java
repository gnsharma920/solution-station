package com.solution.station.array.easy;

import java.util.ArrayList;
import java.util.List;

//An element is called the leader of an array if there is no element greater than it on the right side.
public class LeadersInAnArray {
    public static void main(String[] args) {
        System.out.println(leadersInArray(new int[]{1, 2, 10, 5, 10, 7, 2, 1}));
        System.out.println(leadersInArray(new int[]{1, 2, 3, 5, 6, 7, 8, 9}));
        System.out.println(leadersInArray(new int[]{1, 2, 3, 5, 6, 7, 8, 9}));
    }

    //time: o(n)
    private static List<Integer> leadersInArray(int nums[]) {
        List<Integer> listOfLeaders = new ArrayList<>();
        int maxValue = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1 || nums[i] > maxValue) {
                listOfLeaders.add(nums[i]);
                maxValue = nums[i];
            }
        }
        return listOfLeaders;
    }

    //time: o(n2)
//    private static List<Integer> leadersInArray(int nums[]) {
//        List<Integer> listOfLeaders = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            boolean leader = true;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] <= nums[j]) {
//                    leader = false;
//                    break;
//                }
//            }
//            if (leader) {
//                listOfLeaders.add(nums[i]);
//            }
//        }
//        return listOfLeaders;
//    }
}
