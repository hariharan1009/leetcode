class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        int sum2=0;
       for(int n:nums){
        if(n>9){
            sum2+=n;
            while(n>0){
                sum1+=n%10;
                n/=10;
            }
        }
        else{
            sum1+=n;
            sum2+=n;
        }
       }
       return Math.abs(sum1-sum2);
    }
}