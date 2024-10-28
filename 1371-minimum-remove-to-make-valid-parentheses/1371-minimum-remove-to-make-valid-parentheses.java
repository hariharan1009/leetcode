class Solution {
    public String minRemoveToMakeValid(String s) {
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
    s=String.valueOf(a);
    s=s.replace("*","");
    return s;
    }
}