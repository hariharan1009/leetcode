class Solution {
    public String mergeAlternately(String a, String b) {
        String c="";
        int l=Math.max(a.length(),b.length());
        for(int i=0;i<l;i++){
           if(i<a.length()){
              c+=a.charAt(i);
           }
           if(i<b.length()){
               c+=b.charAt(i);
           }
        }
        return c;
    }
}