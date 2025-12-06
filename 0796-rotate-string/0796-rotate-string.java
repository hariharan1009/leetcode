class Solution {
    public boolean rotateString(String s, String g) {
       if(s.length()!=g.length()) return false;
       return (s+s).contains(g); 
    }
}