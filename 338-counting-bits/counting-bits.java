class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];

         for(int i=0;i<=n;i++){
           arr[i]=countbit(i);
        }
        return arr;}
        
       private static int countbit(int num){
        int c=0;
        while(num>0){
            num&=(num-1);
            c++;
        }
        return c;
       }}



    //    another inbuilt function 
        //  arr[i]=Integer.bitCount(i)