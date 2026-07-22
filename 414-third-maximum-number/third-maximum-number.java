class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        if(s.size()<3){
            return Collections.max(s);
        }
        ArrayList<Integer> l=new ArrayList<>(s);
        Collections.sort(l,Collections.reverseOrder());
        return l.get(2);
    }
}