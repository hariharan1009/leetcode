class Solution {
    public boolean canJump(int[] nums) {
        int x=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=x) x=i;
        }
        return x==0;
    }
}