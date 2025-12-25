class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        Arrays.sort(h);
        int i=0;
        int j=h.length-1;
        while(i<j){
            h[i]=h[i]+h[j];
            h[j]=h[i]-h[j];
            h[i]=h[i]-h[j];
            i++;
            j--;
        }
        long sum=0;
        int d=0;
        for(i=0;i<k;i++){
            sum+=Math.max(h[i]-d,0);
            d++;
        }
        return sum;
    }
}