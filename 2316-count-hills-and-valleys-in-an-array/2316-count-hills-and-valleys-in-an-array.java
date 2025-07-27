class Solution {
    public int countHillValley(int[] nums) {
      int index=0,count=0;
      for(int i=1;i<nums.length-1;i++){
        if((nums[index]<nums[i] && nums[i+1]<nums[i])||
        (nums[index]>nums[i] && nums[i+1]>nums[i])){
            count++;
            index=i;
        }
      }
        return count;
    }
}