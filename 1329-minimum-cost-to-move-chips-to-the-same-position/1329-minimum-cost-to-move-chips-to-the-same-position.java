class Solution {
    public int minCostToMoveChips(int[] arr) {
        int e=0;
        int o=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                e++;
            }
            else{
                o++;
            }
        }
        return Math.min(e,o);



        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i:arr){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // int emin=Integer.MAX_VALUE;
        // int omin=Integer.MAX_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2==0 && emin<map.get(arr[i])){
        //         emin=i;
        //     }
        //     if(arr[i]%2!=0 && omin<map.get(arr[i])){
        //         omin=i;
        //     }
        // }
        // return Math.min(emin,omin);
    }
}