class Solution {
    public int hammingDistance(int x, int y) {
    //   int xor=x^y;
    //   int c=0;
    //   while(xor!=0){
    //     c+=xor & 1;
    //     xor>>=1;
    //   }

      // Another Approach 
      return Integer.bitCount(x^y);
    //   return c;
    }
}