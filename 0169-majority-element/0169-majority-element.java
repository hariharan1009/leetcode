class Solution {
    public int majorityElement(int[] nums) {
        int c=0;;
        int a=0;
        for(int n:nums){
            if(c==0){
                a=n;
            }
            if(n==a){
                c++;
            }
            else{
                c--;
            }
        }
        return a;
    }
}