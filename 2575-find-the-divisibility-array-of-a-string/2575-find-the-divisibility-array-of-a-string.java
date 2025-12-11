class Solution {
    public int[] divisibilityArray(String word, int m) {
        long x=0;
        int[] a=new int[word.length()];
        for(int i=0;i<word.length();i++){
            int d=word.charAt(i)-'0';
            x=x*10+d;
            if(x%m==0) a[i]=1;
            else a[i]=0;
            x%=m;
        }
        return a;
    }
}