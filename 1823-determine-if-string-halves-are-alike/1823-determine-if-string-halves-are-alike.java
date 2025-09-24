class Solution {
    public boolean halvesAreAlike(String s) {
        String v="AEIOUaeiou";
        int c=0;
        for(int i=0;i<s.length()/2;i++){
            if(v.contains(String.valueOf(s.charAt(i)))){
                c++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            if(v.contains(String.valueOf(s.charAt(i)))){
                c--;
            }
        }
        return c==0;
    }
}