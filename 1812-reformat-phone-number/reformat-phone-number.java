class Solution {
    public String reformatNumber(String number) {
        String s=number.trim();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
    String finalized= sb.toString();
   int n=finalized.length();
           StringBuilder result=new StringBuilder();
   int i=0;
   while(n-i>4){
        result.append(finalized,i,i+3).append("-");
        i+=3;
   }
   if(n-i==4){
       result.append(finalized,i,i+2).append("-");
          result.append(finalized,i+2,i+4);
   }
   else{
     result.append(finalized,i,n);
   }
   return result.toString();
    
    }
}