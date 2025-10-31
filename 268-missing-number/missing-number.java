class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        Set<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        for(int i=0;i<=len;i++){
            if(set.add(i)){
                return i;
            }
        }
        return 0;
        
    }
}