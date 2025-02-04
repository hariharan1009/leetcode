class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0],tot=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                sum+=nums[i];
            }
            else{
                sum=nums[i];
            }
           tot=Math.max(tot,sum);
        }
        return tot;
    }
}