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
        
    dp[0] = 0;
    dp[1] = nums[0];

   for(int i = 2; i <= n; i++) {
            dp[i] = Math.max(nums[i - 1] + dp[i - 2], dp[i - 1]);
        }



    return dp[n];


   
// return totalrob(nums,nums.length-1,dp);

//     }


//     int totalrob(int arr[],int n,int dp[]){
//         if(n<0){
//             return 0;
//         }
//          if(dp[n]!=-1){
//             return dp[n];
//          }
//         dp[n]=Math.max(arr[n]+totalrob(arr,n-2,dp),totalrob(arr,n-1,dp));

//         return dp[n];
    }
}