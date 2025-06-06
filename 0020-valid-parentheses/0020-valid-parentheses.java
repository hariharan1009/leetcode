class Solution {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='(' || i=='['||i=='{'){
                a.push(i);
            }
            else{
                if(a.isEmpty()){
                    return false;
                }
                char p=a.pop();
                if((i==')' && p!='(')||(i==']' && p!='[')||(i=='}'&&p!='{')){
                    return false;
                }
            }
            } 
        return a.isEmpty();
    }
}