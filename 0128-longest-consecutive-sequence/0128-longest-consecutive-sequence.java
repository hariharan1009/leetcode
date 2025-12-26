class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int last=nums[0];
        int c=1;
        int max=c;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==last+1) c++;
            else if(nums[i]!=last) c=1;
            last=nums[i];
            max=Math.max(max,c);
        }
        return max;
    }
}