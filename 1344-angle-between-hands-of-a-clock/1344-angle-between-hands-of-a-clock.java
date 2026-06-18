class Solution {
    public double angleClock(int hour, int minutes) {
        double ma=minutes*6;
        double h=(hour%12)*30+minutes *0.5;
        double a=Math.abs(h-ma);
        return Math.min(a,360-a);
    }
}