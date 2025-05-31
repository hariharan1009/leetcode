class Solution {
    public int hammingWeight(int n) {
        int sum=0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1)==1){
                sum+=1;
            }
        }
        return sum;
    }
}