class Solution {
    public boolean threeConsecutiveOdds(int[] nums) {
    
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]%2!=0 &&nums[i-1]%2!=0 && nums[i+1]%2!=0){
                return true;
            }
        }
        return false;
    }
}