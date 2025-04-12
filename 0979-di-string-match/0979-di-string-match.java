class Solution {
    public int[] diStringMatch(String s) {
        int icount=0;
        int dcount=s.length();
        int[] a=new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                a[i]=icount;
                icount++;
            }
            else{
                a[i]=dcount;
                dcount--;
            }
        }
        a[s.length()]=icount;
        return a;
    }
}