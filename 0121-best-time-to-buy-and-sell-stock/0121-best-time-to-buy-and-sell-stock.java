class Solution {
    public int maxProfit(int[] nums) {
        int buy=nums[0];
        int pro=0;
        for(int i=0;i<nums.length;i++){
            if(buy>nums[i]){
                buy=nums[i];
            }
            else{
                pro=Math.max(pro,nums[i]-buy);
            }
        }
        return pro;
    }
}