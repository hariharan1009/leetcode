class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] b=nums.clone();
        for(int i=0;i<k;i++){
            Arrays.sort(b);
            for(int j=0;j<nums.length;j++){
                if(nums[j]==b[0]){
                    nums[j]*=multiplier;
                    b[0]*=multiplier;
                    break;
                }
            }
        }
        return nums;
    }
}