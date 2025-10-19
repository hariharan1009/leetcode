class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int c=k-1;
        if(c==0) return true;
        for(int i=k+1;i<nums.size();i++){
            if(nums.get(i)>nums.get(i-1) && nums.get(i-k)> nums.get(i-k-1)){
                c--;
            }
            else{
                c=k-1;
            }

            if(c==0){
                return true;
            }
        }
        return false;
    }
}