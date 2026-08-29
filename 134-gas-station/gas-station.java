class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot_gas=0,gass=0,s=0;
        for(int i=0;i<gas.length;i++){
            tot_gas+=gas[i]-cost[i];
            gass+=gas[i]-cost[i];
            if(gass<0){
                gass=0;
                s=i+1;
            }
        }
        return tot_gas<0 ?-1 : s;
    }
}