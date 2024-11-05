class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s=countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int c=1;
            char a=s.charAt(i);
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
               c++;
                i++;
            }
            sb.append(c).append(a);
        }
     return sb.toString();
    }
}