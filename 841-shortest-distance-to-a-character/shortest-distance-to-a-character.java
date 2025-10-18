class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int arr[]=new int[n];
        int prev=Integer.MIN_VALUE/2;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                prev=i;
            }
            arr[i]=Math.abs(i-prev);

        }
        int p=Integer.MAX_VALUE/2;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==c){
                p=i;
            }
          arr[i] = Math.min(arr[i], p - i);
        }
        return arr;
    }
}