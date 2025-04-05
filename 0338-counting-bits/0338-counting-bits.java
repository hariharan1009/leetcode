class Solution {
    public int[] countBits(int n) {
        int[] dp=new int[n+1];
        int x=1;
        for(int i=1;i<=n;i++){
            if(x*2==i){
                x=i;
            }
            dp[i]=dp[i-x]+1;
        }
        return dp;
    }
}