class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String c:tokens){
            if(c.equals("+")){
                s.push(s.pop()+s.pop());
            }
            else if(c.equals("-")){
                int x=s.pop();
                int y=s.pop();
                s.push(y-x);
            }
            else if(c.equals("*")){
                s.push(s.pop()*s.pop());
            }
            else if(c.equals("/")){
                 int x=s.pop();
                 int y=s.pop();
                 s.push(y/x);
            }
            else{
                s.push(Integer.parseInt(c));
            }
        }
        return s.peek();
    }
}