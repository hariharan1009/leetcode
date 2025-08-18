class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0,j=s.length()-1;
        char a[]=s.toCharArray();
        while(i<j){
            if(!Character.isLetter(a[i])){
                i++;
            }
            else if(!Character.isLetter(a[j])){
                j--;
            }
            else{
                char tem=a[i];
                a[i]=a[j];
                a[j]=tem;
                i++;
                j--;
            }
        }
        return new String(a);
    }
}