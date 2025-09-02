class Solution {
    public boolean isSubsequence(String s, String t) {
        int c=0;
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        int i=0;

       for(int j=0;j<arr2.length && i<arr1.length;j++){
        if(arr1[i]==arr2[j]){
            c++;
            i++;
        }
       }
               
               return c==arr1.length;
            }
        }
     