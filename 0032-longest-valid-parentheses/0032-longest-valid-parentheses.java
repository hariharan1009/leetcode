class Solution {
    public int longestValidParentheses(String s) {
         char[] a=s.toCharArray();
        int open=0;
        int close=0;
        for(int i=0,j=s.length()-1;i<s.length();i++,j--){
            if(a[i]=='('){
                open++;
            }
            if(a[i]==')'){
               open--;
            }
            if(a[j]=='('){
                close--;
            }
            if(a[j]==')'){
                close++;
            }
            if(open<0){
                a[i]='*';
                open=0;
            }
            if(close<0){
                a[j]='*';
                close=0;
            }
        }
        open=0;
        close=0;
        for(int i=0;i<a.length;i++){
            if(a[i]=='*'){
                close=0;
            }
            if(a[i]!='*'){
                close++;
            }
            if(open<close){
                open=close;
            }
        }
            return open;
    }
}