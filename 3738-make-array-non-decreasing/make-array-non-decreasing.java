class Solution {
    public int maximumPossibleSize(int[] nums) {
        int max=Integer.MIN_VALUE;
        int c=0;
        for(int n:nums)
       {
        if(n>=max)
        {
            max=n;
            c++;

        }
  
       }
       return c;
    }
}