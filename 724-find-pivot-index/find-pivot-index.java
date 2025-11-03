class Solution {
    public int pivotIndex(int[] nums) {
        int t=0;
        for(int n:nums){
         t+=n;
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            t-=nums[i];
            if(left==t){
                return i;
            }
            else{
                left+=nums[i];
            }
        }
        return -1;}}

