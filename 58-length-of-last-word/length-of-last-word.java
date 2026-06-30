class Solution {
    public int lengthOfLastWord(String s) {
        String[] a=s.trim().split(" ");
        return a[a.length-1].length();
    }
}