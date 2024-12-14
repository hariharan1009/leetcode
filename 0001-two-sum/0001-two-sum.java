class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // int[] a=new int[2];
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],i);
        //     if()
        // }



        int[] a=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                }
            }
        }
        return a;
    }
}