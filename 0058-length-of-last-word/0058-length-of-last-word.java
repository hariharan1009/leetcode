class Solution {
    public int lengthOfLastWord(String s) {
        String[] a=s.split(" ");
        String c=a[a.length-1];
        return c.length();
        // int count=0;
        // int a=s.length();
        // for(int i=a-1;i>=0;i--){
        //     if(s.charAt(i)==' ' && count>0)
        //     break;
        //     if(s.charAt(i)!=' ')
        //     count+=1;
        // }
        // return count;

    }
}