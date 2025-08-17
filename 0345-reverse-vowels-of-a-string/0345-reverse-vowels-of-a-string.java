class Solution {
    public String reverseVowels(String s) {
        char[] a=s.toCharArray();
       int i=0;
       int j=s.length()-1;
       String b="AEIOUaeiou";
       while(i<j){
          while(i<j && b.indexOf(a[i])==-1) i++;
          while(i<j && b.indexOf(a[j])==-1) j--;
         char tem=a[i];
            a[i]=a[j];
            a[j]=tem;
            i++;
            j--; 
       } 
       return new String(a);
    }
}