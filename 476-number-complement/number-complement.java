class Solution {
    public int findComplement(int num) {
        StringBuilder sb=new StringBuilder();
        String n=Integer.toBinaryString(num);
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='1'){
                sb.append("0");

            }
            else if(n.charAt(i)=='0'){
                sb.append("1");
            }
        }
        String r=sb.toString();
        return Integer.valueOf(r,2);
        
    }
}