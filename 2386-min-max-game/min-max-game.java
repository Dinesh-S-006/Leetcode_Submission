class Solution {
    public int minMaxGame(int[] nums) {
       int l=nums.length;
       if(l==1) return nums[0];
       while(l!=1)
       {
          int arr[]=new int[l/2];
          int p=0;
          for(int i=0;i<arr.length;i++)
          {
             if(i%2==0){
            arr[i]=Math.min(nums[2*i],nums[2*i+1]);
            }
           else{
                
            arr[i]=Math.max(nums[2*i],nums[2*i+1]);
            
          }}
          nums=arr;
          l=nums.length;
       }
       return nums[0];}}