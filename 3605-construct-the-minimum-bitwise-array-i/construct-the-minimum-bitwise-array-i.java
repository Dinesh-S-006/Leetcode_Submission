class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {

        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int value = nums.get(i);

            if ((value & 1) == 0) {
                ans[i] = -1;
            } 
          
            else {
                ans[i] = value & ~(((value + 1) & ~value) >> 1);
            }
        }
        return ans;
    }
}
