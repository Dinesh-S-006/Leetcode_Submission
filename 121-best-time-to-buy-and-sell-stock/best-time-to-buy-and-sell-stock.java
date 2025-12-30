class Solution {
    public int maxProfit(int[] arr) {
     int maxProfit=0;
     int n=arr.length;
     int min=Integer.MAX_VALUE;


     for(int i=0;i<n;i++){
         if(arr[i]<min){
            min=arr[i];
        
         }
         else{
            int profit=arr[i]-min;
            if(profit>maxProfit){
                maxProfit=profit;
            }
         }

     }
     return maxProfit;}}
       