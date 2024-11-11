class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=i;j>=0;j--){
                dp[i][j] = s.charAt(i)==s.charAt(j) && (i-j<=2 || dp[i-1][j+1]);
                if(dp[i][j] && i-j+1>res.length())
                res=s.substring(j,i+1);
            }
        }
        return res;

    }
}