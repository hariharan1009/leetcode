class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i=0,j=0;
        int x=0,y=0;
        while(i<word1.length && j<word2.length){
            char c1=word1[i].charAt(x);
            char c2=word2[j].charAt(y);
            if(c1!=c2){
                return false;
            }
            x++;
            y++;
            if(x==word1[i].length()){
                x=0;
                i++;
            }
            if(y==word2[j].length()){
                y=0;
                j++;
            }
        }
        return i==word1.length && j==word2.length;
    }
}