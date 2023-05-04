package com.solution.station.array.easy;

public class FrequenciesInASortedArray {
    public static void main(String[] args) {
        System.out.println("*******************************");
        frequenciesInASortedArray(new int[]{10,10,10,20,20,30});
        System.out.println("*******************************");
        frequenciesInASortedArray(new int[]{10,10,10});
        System.out.println("*******************************");
        frequenciesInASortedArray(new int[]{10,20,30});
    }

    private static void frequenciesInASortedArray(int[] nums) {
        int count=1;
        for(int i=0;i<nums.length;i++){
            if(i == nums.length-1){
                System.out.println(nums[i]+": "+count);
                break;
            }
            if(nums[i]==nums[i+1]){
                count++;
            } else {
                System.out.println(nums[i]+": "+count);
                count=1;
            }
        }
    }
}
