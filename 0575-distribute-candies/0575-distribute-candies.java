class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> s=new HashSet<>();
        for(int i:candyType){
            s.add(i);
        }
        int n=candyType.length/2;
        if(s.size()>=n) return n;
        return s.size();
    }
}