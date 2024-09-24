class Solution {
    public boolean isPalindrome(String s) {
        String a="";
        for(char c:s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                a+=c;
            }
        }
        a=a.toUpperCase();
        int x=0;
        int y=a.length()-1;
        while(x<=y){
            if(a.charAt(x)!=a.charAt(y)){
                return false;
            }
            x+=1;
            y-=1;
        }
    return true;
    }
}