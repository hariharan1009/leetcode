class Solution {
    public int missingNumber(int[] nums) {
        int tsum=0;
        for(int i=0;i<=nums.length;i++){
            tsum+=i;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return tsum-sum;
    }
}