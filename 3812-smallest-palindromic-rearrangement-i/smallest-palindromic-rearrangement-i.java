class Solution {
    public String smallestPalindrome(String s) {
        int x=s.length()/2;
        char[] a=s.toCharArray();
        Arrays.sort(a,0,x);
        for(int i=0;i<x;i++){
            a[s.length()-1-i]=a[i];
        }
        return new String(a);
    }
}