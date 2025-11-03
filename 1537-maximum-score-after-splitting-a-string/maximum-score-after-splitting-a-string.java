class Solution {
    public int maxScore(String s) {
        int max=0;
      for(int i=1;i<s.length();i++){
        String left=s.substring(0,i);
        String right=s.substring(i);

        //zerocount in left
int zerocount=0;
 for(int j=0;j<left.length();j++){
    if(left.charAt(j)=='0'){
        zerocount++;
    }
 }
 int onecount=0;
  for(int k=0;k<right.length();k++){
    if(right.charAt(k)=='1'){
        onecount++;
    }
 }
 int score=zerocount+onecount;
 if(score>max){
    max=score;
 }}
return max;
    
      }
            
        }
        