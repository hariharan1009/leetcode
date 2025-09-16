class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:sentence.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        if(map.size()==26) return true;
        return false;
    }
}