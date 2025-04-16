class Solution {
    public String removeOuterParentheses(String s) {
         StringBuilder a=new StringBuilder();
         int c=0;
         for(char i:s.toCharArray()){
            if(i=='('){
                if(c>0){
                    a.append(i);
                }
                c++;
            }
            else if(i==')'){
                c--;
                if(c>0){
                    a.append(i);
                }
            }
         }
         return a.toString();
    }
}