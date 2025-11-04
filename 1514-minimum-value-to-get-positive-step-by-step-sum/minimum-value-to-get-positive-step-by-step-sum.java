class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int ms=Integer.MAX_VALUE;
        for(int n:nums){
            sum+=n;
            ms=Math.min(ms,sum);
        }
        return (ms<0)?1-ms:1;

    }
}