class Solution {
    public int maxProduct(int[] nums) {
        int max =Integer.MIN_VALUE;
        int suffixmax = 1;
        int prefixmax = 1;
        int n = nums.length;

        for(int i = 0;i<n;i++){
            if(prefixmax==0){
                prefixmax=1;
            }

            if(suffixmax==0){
                suffixmax = 1;
            }

            prefixmax *=nums[i];
            suffixmax *= nums[n-i-1];

            max = Math.max(max,Math.max(prefixmax,suffixmax)); 
        }

        return max;
    }
}