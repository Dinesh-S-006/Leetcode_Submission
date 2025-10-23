class Solution {
    public boolean hasSameDigits(String s) {

         while(s.length()>2){
         StringBuilder sb=new StringBuilder();

            for(int i=1;i<s.length();i++){
                int a=s.charAt(i-1)-'0';
                int b=s.charAt(i)-'0';
                sb.append((a+b)%10);}
                s=sb.toString();}
             
           if(s.charAt(0)==s.charAt(1)){
            return true;
           }
           return false;
    }
}

