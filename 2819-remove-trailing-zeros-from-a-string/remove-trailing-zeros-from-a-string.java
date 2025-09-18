class Solution {
    public String removeTrailingZeros(String num) {
        int length=num.length()-1;
        while(length>=0 && num.charAt(length)=='0'){
            length--;
        }


      return num.substring(0,length+1);
            // return num.replaceAll("0+$","");

       
    }
}