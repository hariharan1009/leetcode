class Solution {
    public int maxDepth(String s) {
        int a=0;
        Stack<Character> st=new Stack<Character>();
        for(Character c:s.toCharArray()){
            if(c=='(') st.push('(');
            else if(c==')') st.pop();
            a=Math.max(a,st.size());
        }
        return a;
    }
}