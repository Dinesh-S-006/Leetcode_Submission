class Solution {
    public int[] findErrorNums(int[] nums) {
        int missingNumber=-1;
        int duplicateNumber=-1;
        int n=nums.length;

        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                duplicateNumber=nums[i];
            }
            if((nums[i])>nums[i-1]+1){
                missingNumber=nums[i-1]+1;
            }
        }

        if(nums[n-1]!=n){
             missingNumber=n;

        }
        if(nums[0]!=1){
            missingNumber=1;
        }

        return new int[]{duplicateNumber,missingNumber};}}

     










//         Arrays.sort(nums);
//         int n=nums.length;
//         int dup=-1;
//         int miss=1;

     
//         for(int i=1;i<nums.length;i++){
//             if(nums[i-1]==nums[i]){
//                dup=nums[i];}
//               else if(nums[i]>nums[i-1]+1){
//                 miss=nums[i-1]+1;
                
//               }

//             }
//             if(nums[n-1]!=n){
//                 miss=n;
//             }
        
//         return new int[]{dup,miss};
        
//     }
// }