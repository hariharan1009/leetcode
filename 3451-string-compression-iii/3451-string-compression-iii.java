class Solution {
    public String compressedString(String word) {
        int c=1;
        String s="";
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1)){
                 if(c>=9){
                    s+=(char)(c+'0')+""+word.charAt(i-1);
                    c=0;
                 }
                 c++;
            }
            else{
                s+=(char)(c+'0')+""+word.charAt(i-1);
                c=1;
            }
            
        }
         s+=(char)(c+'0')+""+word.charAt(word.length()-1);
        return s;
    }
}