class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder n = new StringBuilder();
        
        for (char a : s.toCharArray()) {
            if (Character.isLetterOrDigit(a)) {
                n.append(Character.toLowerCase(a));
            }
        }
       String a=n.toString();
       int i=0,j=n.length()-1;
       while(i<j){
        if(a.charAt(i)!=a.charAt(j)){
            return false;
        }
        i++;
        j--;
       }
       return true;
    }
}
