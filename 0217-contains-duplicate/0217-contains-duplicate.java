class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> a=new HashSet<>();
        for(int i:nums){
            a.add(i);
        } 
        if(nums.length==a.size()) return false;
        return true;


        // if the hr comes and say slove without sorting 
        // Arrays.sort(nums);
        // for(int i=0;i<num.length;i++){
        //     if(nums[i]==nums[i-1]){
        //         return false;
        //     }
        // }
        // return true;
    }
}