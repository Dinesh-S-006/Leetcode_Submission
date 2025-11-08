class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int c=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int ps=0;
        for(int n:nums){
            ps+=n;
            int r=ps%k;
            if(r<0){
                r+=k;
            }
            //int c=0;
            if(map.containsKey(r)){
                c+=map.get(r);


            }
            map.put(r,map.getOrDefault(r,0)+1);

        }

        return c;
    }
}