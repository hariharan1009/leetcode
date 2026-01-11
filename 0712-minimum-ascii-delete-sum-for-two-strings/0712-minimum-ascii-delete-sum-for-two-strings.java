class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = s1.charAt(i) + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        int res=0;
        for(char c:s1.toCharArray()){
            res+=c;
        }
        for(char c:s2.toCharArray()){
            res+=c;
        }
        return res-2*dp[0][0];
    }
}