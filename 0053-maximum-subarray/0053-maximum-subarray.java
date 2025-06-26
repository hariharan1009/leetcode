class Solution {
    public int maxSubArray(int[] nums) {
      int sum=Integer.MIN_VALUE;
      int max=sum;
      for(int i=0;i<nums.length;i++){
        if(sum<0){
            sum=0;
        }
        sum+=nums[i];
        max=Math.max(max,sum);
        
      }
      return max;
    }
}