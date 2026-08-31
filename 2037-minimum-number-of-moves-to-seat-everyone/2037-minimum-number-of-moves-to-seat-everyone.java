class Solution {
    public int minMovesToSeat(int[] seats, int[] s) {
        Arrays.sort(seats);
        Arrays.sort(s);
        int ans=0;
        for(int i=0;i<s.length;i++){
            ans+=Math.abs(seats[i]-s[i]);
        }
        return ans;
    }
}