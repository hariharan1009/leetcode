class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
            
        int a=map.get(s.charAt(0));
        for(Character i:map.keySet()){
            if(map.get(i)!=a){
                return false;
            }
        }
        return true;
    }
}