class Solution {
    public int[] evenOddBit(int n) {
        int e=0;
        int o=0;
        int i=0;

       while(n>0){
        if((n & 1)==1){
            if(i%2==0){
                e++;
            }
            else {
                o++;
            }
        }
        n>>=1;
        i++;

       }
       return new int[]{e,o};

    }
}