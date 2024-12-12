class Solution {
    public String addSpaces(String s, int[] spaces) {
        int a=0;
       StringBuilder sb=new StringBuilder();
       for(int i:spaces){
        sb.append(s.substring(a,i)).append(" ");
        a=i;
       }
       sb.append(s.substring(a));
       return sb.toString();
    }
}