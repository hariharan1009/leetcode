class Solution {
    public boolean judgeCircle(String moves) {
        int a=0,b=0;
        for(char c:moves.toCharArray()){
            if(c=='U'){
                a--;
            }
            else if(c=='D'){
                a++;
            }
            if(c=='R'){
                b++;
            }
            else if(c=='L'){
                b--;
            }
        }
        return a==0 &&b==0;
    }
}