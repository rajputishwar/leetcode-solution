class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }

        if(n==1){
            return nums[0];
        }
        int dp[] = new int[nums.length+1];
        
        Arrays.fill(dp,-1);

   
return totalrob(nums,nums.length-1,dp);

    }


    int totalrob(int arr[],int n,int dp[]){
        if(n<0){
            return 0;
        }
         if(dp[n]!=-1){
            return dp[n];
         }
        dp[n]=Math.max(arr[n]+totalrob(arr,n-2,dp),totalrob(arr,n-1,dp));

        return dp[n];
    }
}