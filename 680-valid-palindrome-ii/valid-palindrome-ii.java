class Solution {
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return pal(s,l+1,r)|| pal(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    private boolean pal(String s,int l,int r ){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}