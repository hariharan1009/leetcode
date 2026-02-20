class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            c+=cal(s,i,i);
            c+=cal(s,i,i+1);
        }
        return c;
    }
    public int cal(String s,int i,int j){
        int c=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            c++;
            i--;
            j++;
        }
        return c;
    }
}