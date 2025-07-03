class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t_gas = 0;
        int t_cost = 0;

        for(int i = 0;i<gas.length;i++){
            t_gas+=gas[i];
            t_cost+=cost[i];
        }

        if(t_cost>t_gas){
            return -1;
        }

        int currgas = 0;
        int st_indx = 0;

        for(int i =0 ;i<gas.length;i++){
            currgas += gas[i]-cost[i];

            if(currgas  < 0){
                currgas = 0;
                st_indx=i+1;
            }
        }

        return  st_indx;
    }
}