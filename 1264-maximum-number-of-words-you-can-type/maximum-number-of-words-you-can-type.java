class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;

        String word[]=text.split(" ");
        for(String w:word){
            boolean broken=false;
            for(int i=0;i<w.length();i++){
                char c=w.charAt(i);
                for(int j=0;j<brokenLetters.length();j++){
                    if(c==brokenLetters.charAt(j)){
                        broken=true;
                        break;
                    }
                }
                if(broken){break;}
            }
            if(!broken){
                count++;
            }
        }

        
    
       return count;
        
    }
}