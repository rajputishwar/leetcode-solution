class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int totalwater = 0;
       int leftmax[] = new int[n];
       int rightmax[] = new int[n];
      leftmax[0] = height[0];
       for(int i = 1;i<n;i++){
        leftmax[i] = Math.max(leftmax[i-1],height[i]);
       }

       rightmax[n-1] = height[n-1];

       for(int j = n-2;j>=0;j--){
        rightmax[j] = Math.max(rightmax[j+1],height[j]);
       }


       for(int i = 0;i<n;i++){
        int waterlvl = Math.min(leftmax[i],rightmax[i]);

        totalwater += waterlvl - height[i]; 
       }

       return totalwater;
    }
}