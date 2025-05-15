class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0,sum= 0,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                min=Math.min(min,i-j+1);
                sum-=nums[j];
                j++;
            }
        }
        return (min== Integer.MAX_VALUE) ? 0 : min;
    }
}