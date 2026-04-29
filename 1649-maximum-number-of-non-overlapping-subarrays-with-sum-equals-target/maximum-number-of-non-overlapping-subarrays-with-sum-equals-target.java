class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
       // int n=nums.length;
       Set<Integer>set=new HashSet<>();
       int c=0;
       set.add(0);
       int sum=0;
       for(int n:nums){
        sum+=n;
        if(set.contains(sum-target)){
           c++;
           set.clear();
           set.add(0);
           sum=0;
        }
        else{
            set.add(sum);
        }


       }
       return c;
    }
}