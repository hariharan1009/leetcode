class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i:nums) sum+=i;
        int ls=0,c=0;
        for(int i=0;i<nums.length-1;i++){
              ls+=nums[i];
              int r=sum-ls;
              if((r-ls)%2==0) c++;
        }
        return c;
    }
}