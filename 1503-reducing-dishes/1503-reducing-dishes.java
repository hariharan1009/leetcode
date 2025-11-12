class Solution {
    public int maxSatisfaction(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0;
        int tot=0;
        for(int i=n -1;i>=0 && nums[i]>-sum ;i--){
            sum+=nums[i];
            tot+=sum;
        }
        return tot;
    }
}