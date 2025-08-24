class Solution {
    public int maxSubArray(int[] nums) {
         int max=nums[0];
        int total=0;
        for (int n:nums) {
            if (total< 0) {
                total=0;
            }
            total += n;
            max = Math.max(max, total);
        }
        return max;       
    }
}