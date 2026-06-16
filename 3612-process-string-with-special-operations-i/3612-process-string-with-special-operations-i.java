class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='*'){
                if (sb.length() > 0){
                    sb.setLength(sb.length() - 1);
                }
            }
            else if(c=='#'){
                sb.append(sb);
            }
            else if(c=='%'){
                sb.reverse();
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}