class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] c = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        if (pattern.length() != c.length){
            return false;
        } 
        for (int i = 0; i < pattern.length(); i++) {
            char a = pattern.charAt(i);
            String b = c[i];
            if (map.containsKey(a)) {
                if (!map.get(a).equals(b)){
                    return false;
                } 
            } else {
                if (map.containsValue(b)){
                    return false;
                } 
                map.put(a, b);
            }
        }
        return true;
    }
}