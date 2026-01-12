class Solution {
   static int dir[][]={{0,1},{1,0},{-1,0},{0,-1}};

    public int longestIncreasingPath(int[][] arr) {

        int r=arr.length;
        int longestPath=0;
        int c=arr[0].length;
        int[][] mem=new int[r][c];
  if(arr.length==0 || r<0 ||c<0) return 0;
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          int path=dfs(arr,r,c,i,j,mem);
         longestPath=Math.max(path,longestPath);
        }
        }
        return longestPath;}
     public static int dfs(int matrix[][],int m,int n,int i,int j,int[][] mem){
        if(mem[i][j]>0) return mem[i][j];
        int max=0;
        for(int[] d: dir){
            int x=i+d[0],y=j+d[1];
            if(x>=0 && y>=0 && x<m && y<n && matrix[x][y]>matrix[i][j]){
                max=Math.max(max,dfs(matrix,m,n,x,y,mem));
            }
        
        mem[i][j]=max+1;}
              return max+1;}
     }