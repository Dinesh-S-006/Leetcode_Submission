class Solution {
    public static int GCD(int a,int b)
    {
       if(b==0) return a;
     return  GCD(b,Math.abs(a-b));
       
    }
    public int gcdOfOddEvenSums(int n) {
        int evensum=0;
        int oddsum=0;
        for(int i=1;i<=n+n;i++)
        {
            if(i%2==0)
            {
             evensum+=i;
            }
            else
            {
                oddsum+=i;
            }

        }
  int output=GCD(oddsum,evensum);
  return output;
        
    }
}