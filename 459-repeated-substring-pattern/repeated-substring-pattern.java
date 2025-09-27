class Solution {
    public boolean repeatedSubstringPattern(String s) {
      String add=(s+s).substring(1,s.length()*2-1);
      return add.contains(s);
        
    }
}