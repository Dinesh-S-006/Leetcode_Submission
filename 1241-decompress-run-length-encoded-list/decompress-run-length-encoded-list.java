class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                 size+=nums[i];
            }
        }
        int p=0;
        int arr[]=new int[size];
        for(int i=0;i<nums.length;i++){
            if(i%2!=0){
                for(int j=0;j<nums[i-1];j++){
                    arr[p]=nums[i];
                    p++;
                }
                
            }
        }
        return arr;
        
    }
}