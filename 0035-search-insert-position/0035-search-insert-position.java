class Solution {
    public int searchInsert(int[] nums, int target) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                c++;
            }
        }
        return c;
    }
}