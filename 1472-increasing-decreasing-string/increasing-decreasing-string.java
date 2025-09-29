class Solution {
    public String sortString(String s) {
        int count[]=new int[26];
      for(char ch:s.toCharArray()){
        count[ch-'a']++;
      }
      
      int n=s.length();
      StringBuilder sb=new StringBuilder();
      while(sb.length()<n){
      for(int i=0;i<26;i++){
        if(count[i]>0){
            sb.append((char)(i+'a'));
              count[i]--;
        }
      
      }
       for(int i=25;i>=0;i--){
        if(count[i]>0){
             sb.append((char)(i+'a'));
              count[i]--;
        }
      
      }}
  return sb.toString();

        }
    }
