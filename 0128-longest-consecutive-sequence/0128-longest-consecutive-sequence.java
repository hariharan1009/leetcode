class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int c=1;
        int x=nums[0];
        int max=c;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==x+1){
                c++;
            }
            else if(nums[i]!=x){
                c=1;
            }
            x=nums[i];
            max=Math.max(c,max);
        }
        return max;
    }
}