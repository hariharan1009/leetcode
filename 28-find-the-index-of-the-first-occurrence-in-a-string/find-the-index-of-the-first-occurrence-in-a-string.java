class Solution {
    public int strStr(String a, String b) {
      int m = a.length();
      int n = b.length();  
      if(a.length()<b.length()) return -1;
      for(int i=0;i<=m-n;i++){
        if(a.substring(i,i+n).equals(b)){
            return i;
        }
      }
      return -1;
    }
}