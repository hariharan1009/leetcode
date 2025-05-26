class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int pre=nums[0];
        int c=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]== pre+1){
                c++;
            }
            else if(nums[i]!=pre){
                c=1;
            }
            pre=nums[i];
            max=Math.max(max,c);
        }
        return max;
    }
}