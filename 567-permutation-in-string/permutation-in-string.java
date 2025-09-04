class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){return false;}
        int s11[]=new int[26];
        int s22[]=new int[26];
        int window=s1.length();
        for(char c:s1.toCharArray()){
           s11[c-'a']++;
        }
       
        for(int i=0;i<window;i++){
            s22[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(s11,s22)){
            return true;
        }
        for(int i=window;i<s2.length();i++){
            s22[s2.charAt(i)-'a']++;
            s22[s2.charAt(i-window)-'a']--;
            if(Arrays.equals(s11,s22)){
            return true;
        }
       
    }
     return false;
}}