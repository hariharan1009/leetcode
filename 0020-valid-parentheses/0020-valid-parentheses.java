class Solution {
    public boolean isValid(String s) {
       Stack<Character> a = new Stack<Character>();
       for(char c:s.toCharArray()){
       
        if(c=='('){
            a.push(')');
        }
        else if(c=='{'){
            a.push('}');
        }
        else if(c=='['){
            a.push(']');
        }
        else if(a.isEmpty()||a.pop()!=c){
            return false;
        }
       }
       return a.isEmpty(); 
    }
}