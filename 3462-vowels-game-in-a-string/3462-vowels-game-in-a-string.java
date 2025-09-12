class Solution {
    public boolean doesAliceWin(String s) {
        for(char c:s.toCharArray()){
            if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u'){
                return true;
            }
        }
        return false;
    }
}