class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int RL=ransomNote.length();
       int mL=magazine.length();
       if(RL>mL) return false;
       int marr[]=new int[26];

       for(int i=0;i<mL;i++){
         marr[magazine.charAt(i)-'a']++;}
        
        
       for(int i=0;i<RL;i++){
        char ch=ransomNote.charAt(i);
        if( marr[ch -'a']==0){
            return false;
        }
        marr[ch-'a']--;
 }
            return true;
        }
       }
    
