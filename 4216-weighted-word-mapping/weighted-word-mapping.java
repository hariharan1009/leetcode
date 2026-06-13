class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(String s:words){
            int num=0;
            for(int i=0;i<s.length();i++){
                num+=weights[s.charAt(i)-'a'];
            }
            sb.append((char)('z'-(num%26)));
        }
        return sb.toString();
    }
}