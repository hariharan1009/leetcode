class Solution {
    public int[] twoSum(int[] nums, int target) {
        //using hasmap 
           HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if(map.containsKey(a) && map.get(a)!=i){
                return new int[]{i, map.get(a)};
            }
        }
        return new int[]{};



        //using Array
        //  int[] a=new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             a[0]=i;
        //             a[1]=j;
        //         }
        //     }
        // }
        // return a;
    }
}