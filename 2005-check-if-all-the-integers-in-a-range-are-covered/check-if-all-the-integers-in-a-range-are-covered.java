class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
      boolean covered=false;
        for(int i=left;i<=right;i++){

        
        for(int n[]:ranges){
         covered=false;
            int e1=n[0];
            int e2=n[1];
            if(i>=e1 && i<=e2){
                covered=true;
                break;
            
            }}
            if(!covered) return false;
        }
       return true;
    }
}