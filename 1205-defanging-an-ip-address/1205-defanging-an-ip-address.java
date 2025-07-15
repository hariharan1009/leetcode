class Solution {
    public String defangIPaddr(String a) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length();i++){
          if(a.charAt(i)=='.'){
            sb.append("[.]");
          }
          else{
            sb.append(a.charAt(i));
          }
        }
        return sb.toString();
    }
}