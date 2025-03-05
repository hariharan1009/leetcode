class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0,l=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c) && map.get(c) >=l){
                l=map.get(c)+1;
            }
            max=Math.max(max,i-l+1);
            map.put(c,i);
        }
        return max;
    }
}