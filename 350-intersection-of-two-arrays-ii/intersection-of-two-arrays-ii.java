class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int n1:nums1){
        map.put(n1,map.getOrDefault(n1,0)+1);

       }
       List<Integer>l=new ArrayList<>();

       for(int n2:nums2){
        if(map.containsKey(n2)){
            if(map.get(n2)>0){
                map.put(n2,map.get(n2)-1);
                l.add(n2);


            }
        }
       }
       int arr[]=new int[l.size()];
       for(int i=0;i<l.size();i++){
        arr[i]=l.get(i);
       }
return arr;}}