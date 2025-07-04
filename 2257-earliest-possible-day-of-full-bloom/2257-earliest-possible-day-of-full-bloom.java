class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {

        int n = plantTime.length;
        int mat[][] = new int[n][2];

        for(int i =0;i<n;i++){
            mat[i][0]=plantTime[i];
            mat[i][1]=growTime[i];
        }

        Arrays.sort(mat,(a,b)->b[1] - a[1]);//sortnig in decending order

       int ans = 0;
       int  currplantday = 0;
      
        for(int i =0;i<n;i++){
           int plant = mat[i][0];
           int grow = mat[i][1];
           currplantday += plant;

           int blooming = currplantday + grow;
             ans = Math.max(ans,blooming);
        }
        

        return ans;
    }
}