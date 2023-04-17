package com.solution.station.array.easy;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {

//    public static boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        int count=0;
//        while (count< nums.length-1){
//            if(nums[count]==nums[count+1]){
//                return true;
//            }
//            count++;
//        }
//        return false;
//    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        while (count< nums.length){
            if(map.containsKey(nums[count])){
                return true;
            }
            map.put(nums[count],0);
            count++;
        }
        return false;
    }

    public static void main(String args[]){
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }

}
