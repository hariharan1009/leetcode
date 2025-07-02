class Solution {
    public boolean containsDuplicate(int[] nums) {
        //using hashmap
         HashMap<Integer,Integer> map=new HashMap<>();        
        for(int i=0;i<nums.length;i++){
             if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],0);
        }
        
        return false;
        //using array
        // Arrats.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]){
        //         return true;
        //     }
        // }
        // return false;



        //using HasSet
        //  Set<Integer> set = new HashSet<>(2*nums.length);
        // for (int i : nums) {
        //     if (!set.add(i))
        //         return true;
        // }
        // return false;
    }
}