class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int maxv=0,maxc=0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            char c=entry.getKey();
            int x=entry.getValue();
            if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                maxv=Math.max(x,maxv);
            }
            else{
                maxc=Math.max(x,maxc);
            }
        }
        return maxc+maxv;
    }
}