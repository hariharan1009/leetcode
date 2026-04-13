class Solution {
    public int pivotIndex(int[] nums) {
        int l=0,r=0;
        for(int i:nums){
            r+=i;
        }
        for(int i=0;i<nums.length;i++){
            if(l==r-nums[i]){
                return i;
            }
            l+=nums[i];
            r-=nums[i];
        }
        return -1;
    }
}