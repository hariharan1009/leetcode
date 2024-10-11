class Solution {
    public boolean canJump(int[] nums) {
        int a=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=a){
                a=i;
            }
        }
        return a==0;
    }
}