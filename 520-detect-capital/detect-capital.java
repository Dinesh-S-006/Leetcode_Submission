class Solution {
    public boolean detectCapitalUse(String word) {
      int c=0;
      for(int i=0;i<word.length();i++){
        if(Character.isUpperCase(word.charAt(i))){
           c++;
        }
      }
      return ((word.length()==c|| c==0) || (c==1 && Character.isUpperCase(word.charAt(0))));
    }}






//           boolean cap=false;
//           boolean small=false;
//           boolean first=false;
//          for(char ch:word.tocharArray()){
//             if(ch-'0'>94) {small=true};

//             if(ch-'0'<94) cap=true;
//          }
//         boolean cA=checkALL(word);
//         boolean cU=checkALLUP(word);
//         boolean First=checkFirst(word.charAt(0));
//         if(cA && )
//         if(cA || cU || First){
//             return true;
//         }
//         return false;
//         }

//     public boolean checkALL(String word){
//       for(char ch:word.toCharArray()){
//             if(ch-'0' >94){
//                 return false;}
//             }
//             return true;
//     }
//     public boolean checkALLUP(String word){
//               for(char ch:word.toCharArray()){
//             if(ch-'0' <94){
//                 return false;}
//             }
//             return true;
//     }
//     public boolean checkFirst(char ch){
//         if(ch-'0'>94) return true;
//         return false;
//     }

     
// }
    
