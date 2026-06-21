class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int c=0;
        Arrays.sort(costs);
        for(int i:costs){
           if(coins<i) {
            break;
           }
           coins-=i;
           c++;
        }
        return c;
    }
}