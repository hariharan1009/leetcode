class Solution {
    String[] a={"qwertyuiop","asdfghjkl", "zxcvbnm"};
    public String[] findWords(String[] words) {
        ArrayList<String> l=new ArrayList<>();
        for(String s:words){
            if(ispre(s)){
                l.add(s);
            }
        }
        return l.toArray(new String[0]);
    }
    public  boolean ispre(String s){
        s=s.toLowerCase();
        int r=-1;
        for(int i=0;i<a.length;i++){
            if(a[i].indexOf(s.charAt(0))!=-1){
                r=i;
                break;
            }
        }
        for(char c:s.toCharArray()){
            if(a[r].indexOf(c)==-1) return false;
        }
        return true;
    }
}