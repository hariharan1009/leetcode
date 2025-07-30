class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int maxc=0;
        for(int i=0;i<nums.length;i++){
            if(max==nums[i]){
                c++;
                maxc=Math.max(c,maxc);
            }
            else{
                
                c=0;
            }
        }
        return Math.max(c,maxc);
    }
}