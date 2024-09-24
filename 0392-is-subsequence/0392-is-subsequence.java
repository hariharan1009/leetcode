class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
       if(s.length()==0){
        return true;
       }
       while(i<s.length() && j<t.length()){
             if(s.charAt(i)==t.charAt(j)){
                i++;
             } 
            j++;

       }
       return i==s.length();
    }
}