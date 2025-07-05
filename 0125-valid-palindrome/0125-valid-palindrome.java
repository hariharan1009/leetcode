class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char i:s.toCharArray()){
            if(Character.isLetterOrDigit(i)){
                sb.append(Character.toLowerCase(i));
            }
        }
        String a=sb.toString();
        int st=0,e=a.length()-1;
        while(st<e){
            if(a.charAt(st)!=a.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;

        //Without Using StrinngBuilder
    //      String a="";
    //     for(char c:s.toCharArray()){
    //         if(Character.isDigit(c) || Character.isLetter(c)){
    //             a+=c;
    //         }
    //     }
    //     a=a.toUpperCase();
    //     int x=0;
    //     int y=a.length()-1;
    //     while(x<=y){
    //         if(a.charAt(x)!=a.charAt(y)){
    //             return false;
    //         }
    //         x+=1;
    //         y-=1;
    //     }
    // return true;
    }
}