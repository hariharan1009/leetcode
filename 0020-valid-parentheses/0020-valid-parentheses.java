class Solution {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                a.push(c);
            }
            else{
                if(a.isEmpty()){
                    return false;
                }
                char top=a.pop();
                if((c == ')' && top != '(') || (c == '}' && top != '{') ||  (c == ']' && top != '[')){
                    return false;
                }
            }
        }
        return a.isEmpty();
    }
}