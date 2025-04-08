class Solution {
    public int maxScore(String s) {
        int max=0;
        int one=0;
        int zero=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                one++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zero++;
            }
            else{
                one--;
            }
            max=Math.max(max,zero+one);
        }
        return max;
    }
}