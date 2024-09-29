class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
       for(char st: s.toCharArray()){
            if(st=='(' || st=='{' || st=='['){
                stack.push(st);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(st==')' && stack.peek()=='('){
                    stack.pop();
                }
                else if(st=='}' && stack.peek()=='{'){
                    stack.pop();
                }
                else if(st==']' && stack.peek()=='['){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
       }
       if(stack.isEmpty()){
             return true;
       }
       else{
        return false;
       }
    }
}