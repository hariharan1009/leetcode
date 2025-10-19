class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean[] b=new boolean[n+1];
        for(int i:nums){
            if(i>0 && i<=n){
                b[i]=true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!b[i]){
                return i;
            }
        }
        return n+1;
    }
}