class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
             if(sum<=0){
                sum=0;
            }
        }
        return max;
    }
}