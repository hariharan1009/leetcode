class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0,r=0,u=0;
        for(char ch:moves.toCharArray()){
            if(ch=='R') r++;
            else if(ch=='L') l++;
            else u++;
        }
        return Math.abs((l-r))+u;

    }
}