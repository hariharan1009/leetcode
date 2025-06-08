class Solution {
    public int maxProfit(int[] p) {
        int b=p[0];
        int pro=0;
          for (int i = 1; i < p.length; i++) {
            if (b > p[i]) {
                b = p[i];
            }

            pro = Math.max(pro,p[i] - b);
        }
        return pro;
    }
}