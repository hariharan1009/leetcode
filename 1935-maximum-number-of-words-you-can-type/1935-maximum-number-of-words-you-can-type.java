class Solution {
    public int canBeTypedWords(String t, String b) {
        Set<Character> st=new HashSet<>();
        int c=0;
        for(char ch:b.toCharArray()){
            st.add(ch);
        }
        String[] s=t.split(" ");
        for(String a:s){
            for(char ch:a.toCharArray()){
                if(st.contains(ch)){
                    c++;
                    break;
                }
            }
        }
        return s.length-c;
    }
}