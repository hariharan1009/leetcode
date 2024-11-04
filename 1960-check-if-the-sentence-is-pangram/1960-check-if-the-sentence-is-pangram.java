class Solution {
    public boolean checkIfPangram(String s) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < a.length(); i++) {
            if (!s.contains(String.valueOf(a.charAt(i)))) {
                return false;
            }
        }
        return true; 
    }
}