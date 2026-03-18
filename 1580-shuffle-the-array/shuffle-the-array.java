class Solution {
    public int[] shuffle(int[] nums, int n) {
    List<Integer>l1=new ArrayList<>();
    List<Integer>l2=new ArrayList<>();
    for(int i=0;i<n;i++) l1.add(nums[i]);
    for(int i=n;i<(2*n);i++) l2.add(nums[i]);
    int newarr[]=new int[2*n];
    int p=0;
    for(int i=0;i<l1.size();i++){

        newarr[p++]=l1.get(i);
        newarr[p++]=l2.get(i);
    }
     return newarr;}}















        // int arr[]=new int[2*n];
        // int left=0;
        // int right=left+n;
        // int p=0;
        // int c=0;
    
        // while(c<n){
        //     arr[p]=nums[left];
        //     arr[p]=nums[right];
        //        c++;
        //     if(c<n){
        //     left++;
        //     right++;}
         
        // }
        // return arr;}}

























    //     int result[]=new int[2*n];

    //     int k=0;
    //     for(int i=0;i<n;i++){
    //         result[k++]=nums[i];
    //         result[k++]=nums[i+n];
    //     }
    //     return result;
    // }
