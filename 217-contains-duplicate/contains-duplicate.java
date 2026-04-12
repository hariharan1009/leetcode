class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> a=new HashSet<>();
        for(int i:nums){
            a.add(i);
        } 
        if(nums.length==a.size()) return false;
        return true;
    }
}