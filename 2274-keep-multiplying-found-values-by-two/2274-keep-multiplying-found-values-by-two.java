class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int i:nums){
            if(i==original){
                original*=2;
            }
        }
        return original;
    }
}