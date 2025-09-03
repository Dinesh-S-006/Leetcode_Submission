class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxmium=0;
        int minimum=0;
        while(left<right){
            int width=right-left;
            minimum=Math.min(height[left],height[right]);
            int product=width*minimum;
            maxmium=Math.max(maxmium,product);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }


        }
        return maxmium;
        
    }
}