class Solution {
    public int findNumbers(int[] nums) {
        int tc=0;
        
        for(int n:nums){
            int d=0;
            while(n>0){
                int r=n%10;
                d++;
                n/=10;

            }
            if(d%2==0) tc++;

        }
        return tc;
    }
}