class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] ans = new int[n];
        int max_possible = (1 << maximumBit) - 1;
        int total_XOR = 0;
        for (int num : nums) {
            total_XOR ^= num;
        }
        for (int i = 0; i < n; i++) {
            ans[i] = total_XOR ^ max_possible;
            total_XOR ^= nums[n - 1 - i];
        }
        return ans;
    }
}