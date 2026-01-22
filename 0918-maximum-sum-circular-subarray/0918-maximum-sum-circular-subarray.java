class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0,max=nums[0],min=nums[0],cmin=0,cmax=0;
        for(int i:nums){
            cmax=Math.max(i,cmax+i);
            max=Math.max(max,cmax);
            cmin=Math.min(i,i+cmin);
            min=Math.min(min,cmin);
            sum+=i;
        }
        if(max<0) return max;
        return Math.max(max,sum-min);
    }
}