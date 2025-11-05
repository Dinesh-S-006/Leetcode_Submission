class Solution {
    public int findMiddleIndex(int[] nums) {
        int s=0;
        for(int n:nums){
          s+=n;
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            int rightsum=s-nums[i]-left;
            if(rightsum==left){
                return i;
            }
            else{
                left+=nums[i];
            }
        }
        return -1;
        
    }
}