class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=1;i<=nums.length;i++){
            sum^=i;
        }
        for(int i=0;i<nums.length;i++){
            sum^=nums[i];
        }
     return sum;


        // int n=nums.length;
        // int t =n*(n+1)/2;
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum+=nums[i];
        // }
        // return t-sum;

    }
}