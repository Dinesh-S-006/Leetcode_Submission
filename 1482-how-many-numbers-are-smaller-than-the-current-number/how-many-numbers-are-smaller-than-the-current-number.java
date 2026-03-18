class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int min=Integer.MAX_VALUE;
        int smallarr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                if(nums[j]<nums[i]){
                    c++;

                }}}
                smallarr[i]=c;}
                return smallarr;

                
            
        }
    
}