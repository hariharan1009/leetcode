class Solution {
    public int maxBottlesDrunk(int nb, int nc) {
        int c=nb;
        while(nb>=nc){
            nb-=nc-1;
            nc++;
            c++;
        }
        return c;
    }
}