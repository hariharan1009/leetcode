class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i :nums1){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer> a=new ArrayList<>();
        for (int i : nums2) {
            if (map.getOrDefault(i, 0) > 0) {
                a.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int[] b = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            b[i] = a.get(i);
        }
        return b;
    }
}