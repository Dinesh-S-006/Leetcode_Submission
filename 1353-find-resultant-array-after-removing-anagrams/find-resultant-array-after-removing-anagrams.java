class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list=new ArrayList<>();
        String prev="";
        for(String word :words){
            char arr[]=word.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(!s.equals(prev)){
                list.add(word);
                prev=s;
            }
        }
        return list;
        
    }
}