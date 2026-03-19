class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l=new ArrayList<>();
        int j=0;
        for(int i=1;i<=n;i++){
            l.add("Push");
            if(i==target[j]){
                j++;
                if(j==target.length) break;
            }
            else{
                l.add("Pop");
            }
        }
        return l;
        
    }
}