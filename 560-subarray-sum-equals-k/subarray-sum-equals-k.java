class Solution {
    public int subarraySum(int[] nums, int k) {
        
           HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
         
        int n=nums.length;
       int prefixsum=0;
       int c=0;
       for(int num:nums){
        prefixsum+=num;
        if(map.containsKey(prefixsum-k)){
            c+=map.get(prefixsum-k);

        }
        map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);

       }
       return c;}}