class Solution {
    public boolean checkRecord(String s) {
        int absent=0;
        int Conslate=0;
        int present=0;
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
         if(ch=='A'){
            Conslate=0;
            absent++;
            if(absent>1){return false; }
         }
         else if(ch=='L'){
            Conslate++;
            if(Conslate>2){return false;}
            }
      else if(ch=='P'){
                Conslate=0;
            }
         }
      
      return true;} 
    }
