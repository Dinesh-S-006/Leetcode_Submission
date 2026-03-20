import java.util.*;
class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        
        int m=grid.length;
        int n=grid[0].length;
        int result[][]=new int[m-k+1][n-k+1];
        if(k==1){
            for(int i=0;i<m-k+1;i++){
                for(int j=0;j<n-k+1;j++){
                    result[i][j]=0;
                }
            }
        return result;}

        for(int i=0;i<=m-k;i++){
            for(int j=0;j<=n-k;j++){
                List<Integer> list=new ArrayList<>();
                for(int x=i;x<i+k;x++){
                    for(int y=j;y<j+k;y++){
                        list.add(grid[x][y]);
                    }
                }
                Collections.sort(list);
                int minD=Integer.MAX_VALUE;
                for(int t=1;t<list.size();t++){
                    if(list.get(t).equals(list.get(t-1))) continue;
                    int D=list.get(t)-list.get(t-1);
                   minD=Math.min(D,minD);}
                   if(minD==Integer.MAX_VALUE){
                    result[i][j]=0;
                   }
             else{
            result[i][j]=minD;}

                }}
            
        return result;
        
    }
}