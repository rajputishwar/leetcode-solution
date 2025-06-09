class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        return Math.max(robRange(nums, 0, n - 2), robRange(nums, 1, n - 1));
    }

    int robRange(int[] nums, int start, int end) {
        int prev1 = 0; // dp[i - 1]
        int prev2 = 0; // dp[i - 2]

        for(int i = start; i <= end; i++) {
            int curr = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
