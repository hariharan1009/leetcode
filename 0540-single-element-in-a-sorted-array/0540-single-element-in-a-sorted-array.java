class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> x:map.entrySet()){
            if(x.getValue()==1){
                return x.getKey();
            }
        }
        return -1;
    }
}