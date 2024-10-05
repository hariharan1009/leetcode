class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       int c=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                c++;
            }
            if(c>n/2){
                return nums[i];
            }  else
            {
                c=1;
            }
        }
        int a=nums[n/2];
        return a;
    }
}