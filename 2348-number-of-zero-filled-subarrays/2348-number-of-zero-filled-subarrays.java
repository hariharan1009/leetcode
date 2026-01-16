class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0,tot=0;
        for(int i:nums){
            if(i==0) c++;
            else c=0;
            tot+=c;
        }
        return tot;
    }
}