class Solution {
    public int[] shuffle(int[] nums, int n) {
        int base=10000;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]+base*nums[n+i];
        }
        for(int i=n-1;i>=0;i--){
            int first=nums[i]/base;
            int sec=nums[i]%base;
            nums[i*2+1]=first;
            nums[i*2]=sec;
        }
        return nums;
    }
}