class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s="";
        String t="";

      for(int i=0;i<word1.length;i++){
        s+=word1[i];}
      for(int j=0;j<word2.length;j++){
        t+=word2[j];
      }
      if(s.equals(t)){
        return true;
      }
return false;}}
      


