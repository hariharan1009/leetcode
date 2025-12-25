class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                a.add(nums[i]);
            }
        }
        int k=0;
        int[] x=new int[a.size()];
        for(int i:a){
            x[k++]=i;
        }
        return x;
    }
}