class Solution {
    public int longestMonotonicSubarray(int[] nums) {
       int max=1,in=1,de=1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1]){
            in++;
            de=1;
        }
        else if(nums[i]<nums[i-1]){
            de++;
            in=1;
        }
        else{
            in=1;
            de=1;
        }
        max=Math.max(max,Math.max(in,de));
       } 
       return max;
    }
}