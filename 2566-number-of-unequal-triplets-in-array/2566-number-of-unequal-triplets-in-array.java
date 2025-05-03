class Solution {
    public int unequalTriplets(int[] nums) {
        int c =0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i;j<nums.length-1;j++){
                for(int k=j;k<nums.length;k++){
                    if(nums[i] != nums[j]&& nums[i] != nums[k]&& nums[j] != nums[k]){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}