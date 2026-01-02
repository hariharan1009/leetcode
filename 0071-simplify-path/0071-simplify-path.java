class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] se=path.split("/");
        for(String s:se){
            if(s.equals(".") || s.isEmpty()) continue;
            if(s.equals("..")){
                if(!st.isEmpty()) st.pop();
            }
            else {
                st.push(s);
            }
        }
        return "/"+String.join("/",st);
    }
}