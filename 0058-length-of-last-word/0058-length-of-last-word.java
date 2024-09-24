class Solution {
    public int lengthOfLastWord(String s) {
        int l=0;
        String a=s.trim();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' '){
                l=0;
            }
            else{
                l++;
            }
        }
        return l;
    }
}