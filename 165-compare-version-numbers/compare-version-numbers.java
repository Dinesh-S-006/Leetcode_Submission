class Solution {
    public int compareVersion(String version1, String version2) {
      String[] substring1=version1.split("\\.");
      String[] substring2=version2.split("\\.");
  
     int n=Math.max(substring1.length,substring2.length);
    for(int i=0;i<n;i++){
        int v1=i<substring1.length?Integer.parseInt(substring1[i]):0;
          int v2=i<substring2.length?Integer.parseInt(substring2[i]):0;

          if(v1<v2){return -1;}
          if(v1>v2){return 1;}
    }
       return 0;
    }
}