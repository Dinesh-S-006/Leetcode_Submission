class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;

            }
            else{
                nums[i]=1;
            }
        }
        int prefixsum=0;
         int c=0;
        for(int i=0;i<nums.length;i++){
              prefixsum+=nums[i];
              if(map.containsKey(prefixsum-k)){
                c+=map.get(prefixsum-k);
              }
              map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return c;
    }
}