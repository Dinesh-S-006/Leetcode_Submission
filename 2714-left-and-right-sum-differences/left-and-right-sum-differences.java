class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ls[]=new int[nums.length];
        int Rs[]=new int[nums.length];
        ls[0]=0;
        for(int i=1;i<nums.length;i++)
        {
            ls[i]=nums[i-1]+ls[i-1];
          
        }
        Rs[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--)
        {
            Rs[i]=Rs[i+1]+nums[i+1];
        }
        int finalarr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            finalarr[i]=Math.abs(Rs[i]-ls[i]);
        }
        return finalarr;
    }
}