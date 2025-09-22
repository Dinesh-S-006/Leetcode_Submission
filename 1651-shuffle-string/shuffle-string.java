class Solution {
    public String restoreString(String s, int[] indices) {
       Map<Character,Integer> map=new HashMap<>();
        char ch[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[indices[i]]=s.charAt(i);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ch.length;i++){
            sb.append(ch[i]);
        }
        return sb.toString();




    }
}