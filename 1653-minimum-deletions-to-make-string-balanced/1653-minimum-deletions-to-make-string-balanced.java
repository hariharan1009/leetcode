class Solution {
    public int minimumDeletions(String s) {
        int[] dp=new int[s.length()];
        int ac=0;
        for(int i=s.length()-1;i>=0;i--){
            dp[i]=ac;
            if(s.charAt(i)=='a') ac++;
        }
        int res=s.length();
        int bc=0;
        for(int i=0;i<s.length();i++){
            res=Math.min(dp[i]+bc,res);
            if(s.charAt(i)=='b') bc++;
        }
        return res;
    }
}