class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int max=nums[i];
            int min=nums[i];
            for(int j=0;j<i;j++){
                max=Math.max(max,nums[j]);
            }
            for(int j=i+1;j<n;j++){
                min=Math.min(min,nums[j]);
            }
            if(max-min<=k){
                return i;
            }
        }
        return -1;
    }
}