class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int dup=-1;
        int miss=1;

     
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
               dup=nums[i];}
              else if(nums[i]>nums[i-1]+1){
                miss=nums[i-1]+1;
                
              }

            }
            if(nums[n-1]!=n){
                miss=n;
            }
        
        return new int[]{dup,miss};
        
    }
}