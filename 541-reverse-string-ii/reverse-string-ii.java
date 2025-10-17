class Solution {
    public String reverseStr(String s, int k) {
        char arr[]=s.toCharArray();

        int n=s.length();
        for(int start=0;start<n;start+=2*k){

        
        int left=start;
        int right=Math.min(start+k-1,s.length()-1);
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }}
        return new String(arr);
    }
}