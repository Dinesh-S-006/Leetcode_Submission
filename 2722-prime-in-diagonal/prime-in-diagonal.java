class Solution {
    public int diagonalPrime(int[][] nums) {
        int rowsize=nums.length;
        int columnsize=nums[0].length;
        int max=0;
    
        for(int i=0;i<rowsize;i++){
               if( checkprime(nums[i][i])){
                 max=Math.max(max,nums[i][i]);
               }}
           
    
    for(int k=0;k<rowsize;k++){
        int j = columnsize- 1 - k;
             if( checkprime(nums[k][j])){
                 max=Math.max(max,nums[k][j]);
        }
    }
    return max;}
            
            public static boolean checkprime(int number){
                boolean result=true;
                if(number<2) return false;
                for(int i=2;i*i<=number;i++){
                    if(number%i==0){
                        result=false;
                    }
                }
                return result;
            }
        }

        
    
