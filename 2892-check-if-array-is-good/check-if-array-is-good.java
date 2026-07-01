class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return false;
            }
        }
        return nums[n]==n;
    }
}