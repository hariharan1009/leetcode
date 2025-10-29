class Solution {
    public String countAndSay(int n) {
        String r="1";
        for(int i=2;i<=n;i++){
            r=co(r);
        }
        return r;
    }
    static String co(String s){
        int c=1;
        StringBuilder sb=new StringBuilder();
        char pre=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==pre){
                c++;
            }
            else{
                sb.append(c).append(pre);
                c=1;
                pre=s.charAt(i);
            }
        }
        sb.append(c).append(pre);
        return sb.toString();
    }
}