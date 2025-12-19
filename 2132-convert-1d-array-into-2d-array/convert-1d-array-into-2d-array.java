class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int  newarr[][] =new int[m][n];
        if(m==0 || (m*n)!=original.length){
            return new int[0][0];
        }else{
        
            int k=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                     newarr[i][j]=original[k++];
                }
            
            }

        }
        return newarr;
    }
}