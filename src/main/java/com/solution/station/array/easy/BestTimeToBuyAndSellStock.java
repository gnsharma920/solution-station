package com.solution.station.array.easy;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int profit=0,count=0,minValue=Integer.MAX_VALUE;
        while(count!=prices.length){
            int tempProfit=prices[count]-minValue;
            profit=Math.max(profit,tempProfit);
            minValue=Math.min(minValue,prices[count]);
            count++;
        }
        return profit;
    }
    public static void main(String args[]){
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
