class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
     HashMap<String,Integer> map=new HashMap<>();
     List<String>result=new ArrayList<>();
     int minsum=Integer.MAX_VALUE;
        int indexsum=0;

     for(int i=0;i<list1.length;i++){
        map.put(list1[i],i);

     }
     for(int i=0;i<list2.length;i++){
        String rest=list2[i];
        if(map.containsKey(rest)){
          indexsum=map.get(rest)+i;
        
        if(indexsum<minsum){
            result.clear();
            result.add(rest);
             minsum= indexsum;

        }
        else if(indexsum==minsum){
            result.add(rest);

        }}}
        return result.toArray(new String[result.size()]);
            
        
     }}