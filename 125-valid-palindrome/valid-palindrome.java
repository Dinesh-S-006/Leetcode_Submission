class Solution {
    public boolean isPalindrome(String s) {
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(Character.isLetterOrDigit(ch)){
            sb.append(Character.toLowerCase(ch));
        }
     }
    String s1=sb.toString();
      String s2=sb.reverse().toString();
      return (s1.equals(s2));
       

    }
}