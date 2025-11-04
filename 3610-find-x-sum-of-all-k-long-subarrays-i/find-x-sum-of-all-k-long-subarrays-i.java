import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1]; // Correct size

        for (int i = 0; i <= n - k; i++) {
            // Step 1: Frequency map for this subarray
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            }

            // Step 2: Convert map to list and sort
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

            list.sort((a, b) -> {
                if (a.getValue().equals(b.getValue())) {
                    return b.getKey() - a.getKey(); // larger number first if freq same
                } else {
                    return b.getValue() - a.getValue(); // higher freq first
                }
            });

            // Step 3: Take top x and calculate sum
            int sum = 0;
            int count = 0;
            for (Map.Entry<Integer, Integer> entry : list) {
                if (count == x) break;
                sum += entry.getKey() * entry.getValue();
                count++;
            }

            ans[i] = sum; // store result for this window
        }

        return ans;
    }
}
