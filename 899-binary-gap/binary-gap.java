class Solution {
    public int binaryGap(int n) {
        String binary=Integer.toBinaryString(n);
        int maxd=0;
       int li=-1;
       for(int i=0;i<binary.length();i++){
        if(binary.charAt(i)=='1'){
            if(li !=-1){
                int d=i-li;
                maxd=Math.max(maxd,d);
            }
            li=i;
        }
       }
       return maxd;}}