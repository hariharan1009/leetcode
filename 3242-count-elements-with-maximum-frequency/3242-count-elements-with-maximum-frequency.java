class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        for(int i: map.values()){
            max=Math.max(i,max);
        }
        int c=0;
        for(int i:map.values()){
            if(max==i){
                c+=i;;
            }
        }
        return c;
    }
}

