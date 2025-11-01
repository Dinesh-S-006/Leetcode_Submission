class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int o=x;
        int reversed=0;
        while(x>0){
            int r=x%10;
            reversed=(reversed*10)+r;
            x=x/10;

        }
      if(o==reversed) return true;
      else return false;
    }
}