package com.solution.station.array.easy;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println("*******************************");
        trappingRainWater(new int[]{3, 0, 3});
        System.out.println("*******************************");
        trappingRainWater(new int[]{2, 0, 3, 1, 5});
        System.out.println("*******************************");
        trappingRainWater(new int[]{10, 20, 30});
        System.out.println("*******************************");
        trappingRainWater(new int[]{30, 20, 10});
        System.out.println("*******************************");
        trappingRainWater(new int[]{30, 40, 10});
        System.out.println("*******************************");
        trappingRainWater(new int[]{5, 0, 6, 2, 3});
        System.out.println("*******************************");
        trappingRainWater(new int[]{5, 0, 0, 2, 3});
        System.out.println("*******************************");
        trappingRainWater(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
    }

    private static void trappingRainWater(int[] nums) {
        int count=0;
        int[] leftMax = new int[nums.length];
        int[] rightMax = new int[nums.length];
        leftMax[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            leftMax[i] = Math.max(nums[i], leftMax[i - 1]);
        }
        rightMax[nums.length - 1] = nums[nums.length - 1];
        for (int i =nums.length-2; i >=0; i--) {
            rightMax[i] = Math.max(nums[i], rightMax[i+1]);
        }
        for (int i = 1; i < nums.length-1; i++) {
            count+=(Math.min(leftMax[i],rightMax[i])-nums[i]);
        }
        System.out.println(count);
    }

}
