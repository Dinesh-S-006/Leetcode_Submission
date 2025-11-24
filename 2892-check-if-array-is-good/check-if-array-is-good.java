class Solution {
    public boolean isGood(int[] nums) {
        int max=0;
        for(int n:nums){
            max=Math.max(max,n);
        }
        int length=nums.length;
        if(length!=max+1){
            return false;
        }
        int freq[]=new int[max+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                return false;
            }
            freq[nums[i]]++;

        }
        for(int i=1;i<max;i++){
            if(freq[i]!=1){
                return false;
            }
        }
        return freq[max]==2;

    }
}