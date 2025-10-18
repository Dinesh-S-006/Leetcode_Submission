class Solution {
    public int maxDistinctElements(int[] nums, int k) {
      
  Arrays.sort(nums);
  int c=0;
  int p=Integer.MIN_VALUE;
  for(int n:nums){
    int current=Math.min(Math.max(n-k,p+1),n+k);
    if(current>p){
        p=current;
        c++;

    }}
    return c;}

  }
      