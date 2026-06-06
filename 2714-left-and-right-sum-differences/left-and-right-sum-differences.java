class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int left_sum=0;
        for(int i=0;i<n;i++){
            res[i] =left_sum;
            left_sum+=nums[i];
        }
        int right_sum=0;
        for(int i=n-1;i>=0;i--){
            res[i]=Math.abs(res[i]-right_sum);
            right_sum+=nums[i];
        }
        return res;
    }
}