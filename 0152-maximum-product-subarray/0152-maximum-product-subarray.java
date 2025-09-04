class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0],min=nums[0],x=nums[0];
        for(int i=1;i<nums.length;i++){
            int temp=Math.max(nums[i],Math.max(min*nums[i],max*nums[i]));
            min=Math.min(nums[i],Math.min(min*nums[i],max*nums[i]));
            max=temp;
            x=Math.max(max,x);
        }
        return x;
    }
}