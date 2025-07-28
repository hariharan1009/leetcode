class Solution {
    public int arraySign(int[] nums) {
        int pro=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                pro*=-1;
            }
            else if(nums[i]==0){
                return 0;
            }
        }
        return pro;
    }
}