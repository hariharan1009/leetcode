class Solution {
    public int singleNumber(int[] nums) {
        //using bit manipulations 
        int c=0;
        for(int i=0;i<nums.length;i++){
            c=c^nums[i];  //In bit same number will disappear and differ number will be store;
        }
        return c;

         //using array
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i+=2){
        //     if(nums[i]!=nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return nums[nums.length-1];

        //using hashmap
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i:nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(map.get(nums[i])==1){
        //         return nums[i];
        //     }
        // }
        // return -1;
    }
}