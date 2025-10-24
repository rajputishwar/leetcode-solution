class Solution {
    public int minFallingPathSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        int n = matrix.length;
        int m = matrix[0].length;
        int dp[][] = new int[n][m];

        for(int i = 0;i<m;i++){
            dp[0][i] = matrix[0][i];
        }

       for(int i = 1;i<n;i++){
        for (int j = 0; j < m; j++) {
            int st = matrix[i][j] + dp[i-1][j];

            int ld = (j > 0) ? matrix[i][j] + dp[i-1][j-1] : (int)1e9; 
            int rd = (j < m-1) ? matrix[i][j] + dp[i-1][j+1] : (int)1e9;

            dp[i][j] = Math.min(st,Math.min(ld,rd));
        }
       }
       
       int ans = Integer.MAX_VALUE;
        for(int j = 0; j < m; j++){
            ans = Math.min(ans, dp[n-1][j]);
        }
        return ans;
    }
}
