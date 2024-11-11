class Solution {
    public String longestPalindrome(String s) {
       int n=s.length();
        int start=0,end=1,max=0;
        boolean[][] dp=new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((s.charAt(i)==s.charAt(j))&&((i-j<2)||dp[i-1][j+1])){
                    dp[i][j]=true;
                    if(i-j>max){
                        max=i-j;
                        start=j;
                        end=i+1;
                    }
                }
            }
        }
        return s.substring(start,end);    

    }
}