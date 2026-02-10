class Solution {
    public int longestBalanced(int[] nums) {
        int max = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> evens = new HashSet<>();
            Set<Integer> odds = new HashSet<>();

            for (int j = i; j < n; j++) {
                if (nums[j] % 2 == 0) {
                    evens.add(nums[j]);
                } else {
                    odds.add(nums[j]);
                }

                if (evens.size() == odds.size()) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }
}