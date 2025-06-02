class Solution {
    public int candy(int[] r) {
        int c=0;
        int sum=0;
        int[] a=new int[r.length];
        Arrays.fill(a,1);
        for(int i=0;i<r.length-1;i++){
            if(r[i]<r[i+1]){
                a[i+1]=a[i]+1;
            }
        }
        for(int i=r.length-2;i>=0;i--){
            if(r[i]>r[i+1]){
                a[i]=Math.max(a[i],a[i+1]+1);
            }
        }
        for(int i:a){
            sum+=i;
        }
        return sum;
    }
}