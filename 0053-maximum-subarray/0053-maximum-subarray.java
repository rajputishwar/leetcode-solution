class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;;
        int curr = 0;

        for(int i = 0;i<nums.length;i++){
            curr+=nums[i];
                  
            maxsum = Math.max(curr,maxsum);
                if(curr<0){
                curr = 0;
            }
    
      
           
        }

        return maxsum;
    }
}