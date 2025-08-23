class Solution {
    public String reverseWords(String s) {
        String[] sa=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=sa.length-1;i>=0;i--){
            sb.append(sa[i]);
            if(i!=0) sb.append(" ");
        }
        return sb.toString();
    }
}