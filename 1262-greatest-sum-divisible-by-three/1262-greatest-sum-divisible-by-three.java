class Solution {
    public int maxSumDivThree(int[] nums) {
       int[] dp=new int[3];
       for(int i:nums){
        int[] a=dp.clone();
        for(int j:a){
            int sum=j+i;
            int r=sum%3;
            dp[r]=Math.max(dp[r],sum);
        }
       }
       return dp[0];
    }
}