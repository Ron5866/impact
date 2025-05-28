package leetcode;

public class l2 {
    
}

class Solution {
    public int maxProfit(int[] arr) {
        int min=arr[0];
        int profit=0;
        int max=0;

        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            profit=arr[i]-min;
            if(profit>max){
                max=profit;
            }
        }
        return max;
    }
}