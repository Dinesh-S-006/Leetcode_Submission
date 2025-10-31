class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        int length=nums.length;

     for(int n:nums){
        min=Math.min(min,n);
           sum+=n;

     }
     return sum-(min*length);
    }}




//         Arrays.sort(nums);
//        int n=nums.length;
//         int move=0;
//         int c=0;
//         for(int i=1;i<nums.length;i++){
//             while(c<n-1){
//             if(nums[i]!=nums[i-1]){
//                 int min=Math.min(nums[i],nums[i-1]);
//                 nums[i]++;
//                 move++;
//             }
                
//                 c++;
//             }
//             c=0;
            
            
//         }
//         return move;}}

// //         int length=nums.length-1;
// //         int c=0;
// //         while( c<length){
// //             for(int n:nums){
// //                 max=Math.max(n);
// //             }
        
// //             for(int n:nums){
// //                 if(c<length){
// //                 if(n<max){
// //                     n++;
                  
// //                 }
// //                     c++;
                
// //             }
// //         }
      
// //         int max=Integer.MIN_VALUE;
// //         for(int n:nums){
// //             if(n>max){
// //                 max=n;
                
// //             }
// //         }
        
// //         for(int num:nums){
// //             count+=Math.abs(max-num);
            
// //         }
        
// //         return count;
// //     }
// // }