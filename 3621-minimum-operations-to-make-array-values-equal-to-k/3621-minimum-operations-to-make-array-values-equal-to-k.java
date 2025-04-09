class Solution {
    public int minOperations(int[] nums, int k) {
       Set<Integer> set = new HashSet<>();
       for(int i:nums){
        if(i<k){
            return -1;
        }
        else if(i>k){
            set.add(i);
        }
       }
       return set.size();
    }
}