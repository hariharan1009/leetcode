class Solution {
    public boolean containsDuplicate(int[] a) {
        Arrays.sort(a);
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]){
                return true;
            }
        }
        return false;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<a.length;i++){
        //      if (map.containsKey(a[i])) {
        //         return true;
        //     }
        //     map.put(a[i],0);
        // }
        
        // return false;
    }
}