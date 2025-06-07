class Solution {
    public String reverseWords(String s) {
        String[] a = s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length;i++){
            sb.append(new StringBuilder(a[i]).reverse()).append(" ");
        }
        return sb.toString().trim();

    }
}