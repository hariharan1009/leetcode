class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return hari(nums,upper+1)-hari(nums,lower);
    }
    public static long hari(int[] nums,int val){
        long sum=0;
        for(int i=0,j=nums.length-1;i<=j;){
            if(nums[i]+nums[j]<val){
                sum+=(j-i);
                i++;
            }
            else{
                j--;
            }
        }
        return sum;
    }
}