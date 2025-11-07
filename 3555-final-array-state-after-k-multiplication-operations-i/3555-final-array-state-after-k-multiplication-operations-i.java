class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] a=nums.clone();
        while(k-->0){
            Arrays.sort(a);
            for(int i=0;i<nums.length;i++){
                if(a[0]==nums[i]){
                    nums[i]*=multiplier;
                    a[0]*=multiplier;
                    break;
                }
            }

        }
        return nums;
    }
}