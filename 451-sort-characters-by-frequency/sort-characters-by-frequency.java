class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> l =new ArrayList<>(map.entrySet());
        l.sort((a,b) -> b.getValue()-a.getValue());
        StringBuilder sb =new StringBuilder();
         for(Map.Entry<Character,Integer>m:l){
            char key=m.getKey();
            int count=m.getValue();
            for(int i=0;i<count;i++){
                sb.append(key);
            }
         }
        return sb.toString();


        
    }
}