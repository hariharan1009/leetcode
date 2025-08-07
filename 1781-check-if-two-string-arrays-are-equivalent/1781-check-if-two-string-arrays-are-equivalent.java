class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String a="",b="";
       for(String i:word1){
        a=a+i;
       } 
       for(String i:word2){
        b=b+i;
       }
       return a.equals(b);
    }
}