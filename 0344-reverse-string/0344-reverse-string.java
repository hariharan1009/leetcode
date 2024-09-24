class Solution {
    public void reverseString(char[] s) {
       int n=s.length;
       char a;
       for (int i=0, j=n-1; i<j; i++,j--)
	     {
	         a = s[i];
	         s[i] = s[j];
	         s[j] = a;
	     }
	     System.out.println(s);
    }
}