class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer>ans = new HashSet<>();
        HashSet<Integer>seen = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                if(seen.contains(nums[i])){
                    ans.remove(nums[i]);
                }
                else{
                    seen.add(nums[i]);
                    ans.add(nums[i]);
                }
            }
        }
        return ans.size();
    }
}