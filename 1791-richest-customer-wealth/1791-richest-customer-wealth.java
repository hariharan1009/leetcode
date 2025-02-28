class Solution {
    public int maximumWealth(int[][] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<nums[i].length;j++){
                sum+=nums[i][j];
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}