class Solution {
    public String reverseWords(String s) {
        String[] a=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=a.length-1;i>=0;i--){
            sb.append(a[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    } 
}