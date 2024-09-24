class Solution {
    public boolean isAnagram(String s, String t) {
       char[] a=s.toCharArray();
       char[] b=t.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       if(s.length()!=t.length()){
        return false;
       }
       return Arrays.equals(a,b); 
    }
}