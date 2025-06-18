class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                max=Math.max(c,max);
            }
            else{
                c=0;
            }
        }
        return max;
    }
}