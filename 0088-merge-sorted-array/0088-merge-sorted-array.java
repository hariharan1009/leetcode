class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
       int i=m-1,j=n-1;
       int s=m+n-1;
       while(j>=0){
        if(i>=0 && a[i]>b[j]){
            a[s--]=a[i--];
        }
        else{
            a[s--]=b[j--];
        }
       }
    }
}