class Solution {
    public int rearrangeCharacters(String s, String t) {
        int[] a=new int[26];
        int[] b=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            b[t.charAt(i)-'a']++;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(b[i]>0){
                min=Math.min(a[i]/b[i],min);
            }
        }
        return min;
    }
}