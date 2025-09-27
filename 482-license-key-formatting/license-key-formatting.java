class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String word=s.replace("-","").toUpperCase();

        int length=word.length();
        int firstgroup=length%k;
        StringBuilder sb=new StringBuilder();
        int i=0;
        if(firstgroup>0){
            sb.append(word.substring(i,firstgroup));
            i=firstgroup;
            if(i<length){
                sb.append("-");
            }
        }
        while(i<length){
            sb.append(word.substring(i,i+k));
            i+=k;
            if(i<length){
                sb.append("-");
            }
        }
        return sb.toString();
    }
}