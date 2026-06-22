class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int newarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int c=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                   c++;
                }
            }
            newarr[i]=c;

        }
       return newarr;
    }
}