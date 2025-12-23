class Solution {
    public int numFriendRequests(int[] a) {
        int n=a.length;
        Arrays.sort(a);
        int c=0;
        for(int i=n-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(a[j]<=(double)0.5*a[i]+7) break;
                else if(a[i]==a[j]) c+=2;
                else if(a[i]<100 && a[j]>100) c++;
                else c++;
            }
        }
        return c;
    }
}