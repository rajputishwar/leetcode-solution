class Solution {
    public int jump(int[] nums) {
        int left =0;
        int right = 0;
        int fartest = 0;
        int jump = 0;
        while(right<nums.length-1){
         for(int  i = left;i<=right;i++){
            fartest = Math.max(fartest,i+nums[i]);
         }

         left = right +1;
         jump++;
         right = fartest;
        }

        return jump;
    }
}