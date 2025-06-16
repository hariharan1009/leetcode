class Solution {
    public int maximumDifference(int[] nums) {
        int sum=0,max=-1,min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>min){
                max=Math.max(max,nums[i]-min);
            }
            else{
                min=nums[i];
            }
           
        }
        return max;
    }
}