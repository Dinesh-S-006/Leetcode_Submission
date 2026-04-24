class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int c=0;
        int L=0;
        int R=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='_'){
                       c++;
            }
             else if(moves.charAt(i)=='L'){
                       L++;
            }
               else if(moves.charAt(i)=='R'){
                       R++;
            }

        }
        int operation=Math.abs(R-L);
        return operation+c;
    }
}