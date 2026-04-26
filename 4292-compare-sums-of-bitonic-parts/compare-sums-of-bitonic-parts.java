class Solution {
    public int compareBitonicSums(int[] nums) {
        long As=0;
        long Ds=0;
        int peak=0;
        int max=nums[0];
         for(int i=1;i<nums.length-1;i++){
              if(nums[i]>max){
                max=nums[i];
                peak=i;
              }
             }
    
           for(int i=0;i<=peak;i++){
               As+=nums[i];}
           for(int i=peak;i<nums.length;i++){
               Ds+=nums[i];}

       
        if(As>Ds) return 0;
        else if(Ds>As) return 1;
        else return -1;
        
        
    }
}