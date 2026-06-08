class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer>l=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        List<Integer>l3=new ArrayList<>();
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                l.add(nums[i]);
            }
            else if(nums[i]>pivot)
            {
                l2.add(nums[i]);
            }
            else
            {
                l3.add(nums[i]);
            }
        }
        int i=0;
        for(int n:l)
        {
            arr[i++]=n;
        }
          for(int n:l3)
        {
            arr[i++]=n;
        }
          for(int n:l2)
        {
            arr[i++]=n;
        }
        return arr;
    

    }
}