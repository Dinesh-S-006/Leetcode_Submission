class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int column=matrix[0].length;

       boolean zerorow[]=new boolean[row];
       boolean zerocolumn[]=new boolean[column];

       for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            if(matrix[i][j]==0){
                zerorow[i]=true;
                zerocolumn[j]=true;
            }
        }
       }
       for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            if(zerorow[i] || zerocolumn[j]){
                matrix[i][j]=0;
            }
        }
       }}}