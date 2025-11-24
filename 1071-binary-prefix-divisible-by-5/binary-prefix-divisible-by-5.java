class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        
        List<Boolean> mylist =new ArrayList<>();
        int current=0;
        for(int n:nums){
              
           current=((current*2)+n)%5;
            mylist.add(current==0);

        }
        return mylist;
    }
}