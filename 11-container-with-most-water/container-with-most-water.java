import java.util.*;
class Solution {
    public int maxArea(int[] height) {


         int left=0;
         int right=height.length-1;
         int maximumarea=0;
        int minimumheight=0;
      

         while(left<right){
            int width=right-left;
            minimumheight=Math.min(height[left],height[right]);
         int  product=width*minimumheight;
           maximumarea=Math.max(maximumarea,product);
           if(height[left]<height[right]){
            left++;
           }else{
           right--;}


         }
         return maximumarea;

        // int left=0;
        // int right=height.length-1;
        // int maxmium=0;
        // int minimum=0;
        // while(left<right){
        //     int width=right-left;
        //     minimum=Math.min(height[left],height[right]);
        //     int product=width*minimum;
        //     maxmium=Math.max(maxmium,product);
        //     if(height[left]<height[right]){
        //         left++;
        //     }
        //     else{
        //         right--;
        //     }


        // }
        // return maxmium;
        
    }
}