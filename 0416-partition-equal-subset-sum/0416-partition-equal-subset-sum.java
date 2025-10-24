class Solution {

    boolean subsetsum(int indx,int target,int[] nums, Boolean[][] dp){
        if(target==0){
            return true;
        }

        if(indx==0){
            return nums[0]==target;
        }

        if(dp[indx][target] != null){
            return dp[indx][target];
        }

        boolean nottake = subsetsum(indx-1,target,nums,dp);
        boolean take = false;

        if(target>=nums[indx]){
            take = subsetsum(indx-1,target-nums[indx],nums,dp);
        }

        return dp[indx][target] = (take || nottake);
    }

    public boolean canPartition(int[] nums) {
        int totalsum = 0;

        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }

        if (totalsum % 2 == 1){
            return false;
        }

        int k = totalsum/2;
        Boolean dp[][] = new Boolean[nums.length][k+1];

        return subsetsum(nums.length-1,k,nums,dp);
    }
}
