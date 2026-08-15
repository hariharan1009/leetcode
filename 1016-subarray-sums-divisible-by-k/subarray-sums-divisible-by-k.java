class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] c=new int[k];
        c[0]=1;
        int p=0,r=0;
        for(int i:nums){
            p=(p+i%k+k)%k;
            r+=c[p]++;
        }
        return r;
    }
}