class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        } 
 int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];

        for(int j = n-2;j>=0;j--){
            rightmax[j]= Math.max(height[j],rightmax[j+1]);
        }
        int watertrap = 0;

    

        for(int i = 0;i<n;i++){
       int waterlvl = Math.min(leftmax[i],rightmax[i]);

       watertrap += waterlvl - height[i];

        }

        return watertrap;

        
    }
}