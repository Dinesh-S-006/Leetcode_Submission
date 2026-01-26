class Solution {
    public int[] searchRange(int[] nums, int target) {
        int newarr[]={-1,-1};
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                newarr[0]=i;
                break;
            }
        }
        if(newarr[0]==-1){
            return newarr;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                newarr[1]=i;
                break;
            }
        }
         return newarr;
    }
}