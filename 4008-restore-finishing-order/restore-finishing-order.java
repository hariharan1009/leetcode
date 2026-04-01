class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int k=0;
        int[] a=new int[friends.length];
        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    a[k++]=order[i];
                }
            }
        }
        return a;
    }
}