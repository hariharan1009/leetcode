class Solution {
    public boolean containsDuplicate(int[] a) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<a.length;i++){
             if (map.containsKey(a[i])) {
                return true;
            }
            map.put(a[i],0);
        }
        
        return false;
    }
}