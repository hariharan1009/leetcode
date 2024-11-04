class Solution {
    public boolean checkIfPangram(String s) {
        boolean[] a=new boolean[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']=true;
        }
        for(int i=0;i<26;i++){
            if(a[i]==false){
                return false;
            }
        }
        return true;
    }
}