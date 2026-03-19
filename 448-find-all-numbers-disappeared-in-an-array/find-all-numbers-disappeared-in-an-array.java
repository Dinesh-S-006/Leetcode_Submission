class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        for(int v:nums){ set.add(v);}
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                l.add(i);
            }

        }
        return l;
    }
}