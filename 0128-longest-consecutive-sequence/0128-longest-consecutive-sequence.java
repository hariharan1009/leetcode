class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int c=1;
        int l=nums[0];
        int max=c;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==l+1){
                c++;
            }
            else if(nums[i]!=l){
                c=1;
            }
            l=nums[i];
            max=Math.max(max,c);
        }
        return max;
    }
}