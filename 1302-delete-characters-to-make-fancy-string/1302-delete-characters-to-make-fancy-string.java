class Solution {
    public String makeFancyString(String s) {
        StringBuilder a=new StringBuilder();
        a.append(s.charAt(0));
        int c=1;
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                c=1;
            }
            if(c<3){
                a.append(s.charAt(i));
            }
        }
       return a.toString();
    }
}