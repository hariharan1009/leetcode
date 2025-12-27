class Solution {
    public int[] finalPrices(int[] p) {
        int n=p.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(p[i]>=p[j]){
                    p[i]=p[i]-p[j];
                    break;
                }
            }
        }
        return p;


    //    int i=0;
    //    int j=1;
    //    while(i<j && j<p.length){
    //     if(p[i]>p[j]){
    //         p[i]-=p[j];
    //         i++;
    //     }
    //     j++;
    //    } 
    //    return p;
    }
}