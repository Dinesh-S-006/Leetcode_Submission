class Solution {
    public int largestAltitude(int[] gain) {
        int min=0;
       int max=0;
       for(int i=0;i<gain.length;i++){

        max+=gain[i];
        min=Math.max(min,max);

       } 
       return min;
    }
}