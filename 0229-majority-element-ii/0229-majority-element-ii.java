class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>nums.length/3){
                s.add(nums[i]);
            }
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(int i:s){
            l.add(i);
        }
        return l;
    }
}