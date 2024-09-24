class Solution {
    public int findClosestNumber(int[] nums) {
        int d=nums[0];
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
          if (Math.abs(nums[i]) < Math.abs(d) || 
               (Math.abs(nums[i]) == Math.abs(d) && nums[i] > d)) {
                d = nums[i];
            }
        }
        return d;
    }
}