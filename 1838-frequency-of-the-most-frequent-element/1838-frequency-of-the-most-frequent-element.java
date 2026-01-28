class Solution {
    public int maxFrequency(int[] nums, int k) {
       long sum= 0,max=0;
       int j=0,i=0;
       Arrays.sort(nums);
       while(i<nums.length){
        sum+=nums[i];
           while(nums[i]*(i-j+1L)>sum +k){
            sum-=nums[j];
            j++;
            }
        max=Math.max(max,i-j+1L);
        i++;
       }
       return (int)max;
    }
}