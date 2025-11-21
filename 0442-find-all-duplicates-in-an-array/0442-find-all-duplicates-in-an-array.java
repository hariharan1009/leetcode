class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>1){
                a.add(nums[i]);
                map.put(nums[i],0);
            }
        }
        return a;
    }
}