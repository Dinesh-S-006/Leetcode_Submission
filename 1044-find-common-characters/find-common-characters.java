class Solution {
    public List<String> commonChars(String[] words) {
        List <String> result=new ArrayList<>();
        List<Character> word1=new ArrayList<>();
       for(char w1:words[0].toCharArray()){
            word1.add(w1);
        }
     
        for(int i=1;i<words.length;i++){
         List<Character> temp=new ArrayList<>(); 
         for(char ch:words[i].toCharArray()){
            if(word1.contains(ch)){
                temp.add(ch);
                word1.remove((Character)ch);

            }
         }
         word1=temp;
        }
        for(char ch:word1){
            result.add(String.valueOf(ch));
        }
        return result;



        }
        
    }
