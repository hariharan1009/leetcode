class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
         int max=nums[nums.length-1];
        int sum=nums[nums.length-1];
        for(int i=1;i<k;i++){
            sum+=nums[nums.length-1]+i;
        }
        return sum;
    }
}