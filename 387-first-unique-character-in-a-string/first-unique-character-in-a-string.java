class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        if(n==1) return 0;
        int freq[]=new int[26];
        Queue<Integer>q=new LinkedList<>();
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<n;i++){
            if(freq[s.charAt(i)-'a']==1){
                q.offer(i);
            }
        }
        return (q.isEmpty())?-1:q.peek();
    }
}