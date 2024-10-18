class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<> ();
        for(int i:nums){
            map.put(i,1);
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                a.add(i);
            }
        }
    return a;
    }
}