class Solution {
    public boolean checkString(String s) {
     
        for(int i=0;i<s.length()-1;i++){
            char a=s.charAt(i);
            if(a=='b' && s.charAt(i+1)=='a'){
                return false;
            }
        } 
        return true;
    }
}