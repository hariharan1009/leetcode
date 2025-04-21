class Solution {
    public int maxProfit(int[] nums) {
        int x=nums[0];
        int y=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<x){
                x=nums[i];
            }
            else{
                y=Math.max(y,nums[i]-x);
            }
        }
        return y;
  }
}