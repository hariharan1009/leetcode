class Solution {
    public int[] sumZero(int n) {
       int[] a=new int[n];
       int j=1;
       for(int i=0;i<n/2;i++){
        a[i]=j;
        a[n-1-i]=-j;
        j++;
       } 
       return a;
    }
}