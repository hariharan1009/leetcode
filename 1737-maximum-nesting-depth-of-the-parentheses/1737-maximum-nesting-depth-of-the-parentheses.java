class Solution {
    public int maxDepth(String s) {
        int max=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;
            }
               if(max<c){
                   max=c;
               }
            else if(s.charAt(i)==')'){
                 c--;
            }
        }
        return max;
    }
}