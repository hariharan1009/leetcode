class Solution {
    public boolean canArrange(int[] arr, int k) {
           int[] a=new int[k];
           for(int i:arr){
            int r=(i%k+k)%k;
            a[r]++;
           }
           for(int i=0;i<=k/2;i++){
            if(i==0){
                if(a[0]%2!=0){
                    return false;
                }
            }
            else {
            if(a[i]!=a[k-i]){
                return false;
            }
           }
           }
           return true;
       }
}