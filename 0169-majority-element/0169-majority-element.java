class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0,x=-1;;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>max){
                max=map.get(nums[i]);
                x=nums[i];
            }
        }
        return x;
    }
}