class Solution {
    public int lengthOfLastWord(String s) {
        String[] a=s.split(" ");
        String c=a[a.length-1];
        return c.length();
    }
}