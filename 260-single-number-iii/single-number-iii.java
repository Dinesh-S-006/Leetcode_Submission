import java.util.*;

class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int v:nums){ xor^=v;}
        int rightmostbit=xor & -xor;
        int a=0;
        int b=0;
        for(int n:nums){
           if((n &rightmostbit)!=0){
             a^=n;
           }
             else{
                b^=n;
             }}
           
           return new int[]{a,b};}}
        // List<Integer> list = new ArrayList<>();

        // for (int i = 0; i < nums.length; i++) {
        //     int c = 0;
        //     for (int j = 0; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             c++;
        //         }
        //     }
        //     if (c == 1) {
        //         list.add(nums[i]);
        //     }
        // }

        // int[] result = new int[list.size()];
        // for (int i = 0; i < list.size(); i++) {
        //     result[i] = list.get(i);
        // }

        // return result;

