class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=k;
        for(int i:nums){
            if(i==sum){
                sum+=k;
            }
        }
        return sum;
    }
}