class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i:nums){
            int c=0,sum=0;
            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    int d1=j;
                    int d2=i/j;
                    if(d1==d2){
                        c++;
                        sum+=d1;
                    }
                    else{
                        c+=2;
                        sum+=d1+d2;
                    }
                    if (c > 4) break;
                }
            }
            if(c==4){
                ans+=sum;
            }
        }
        return ans;
    }
}