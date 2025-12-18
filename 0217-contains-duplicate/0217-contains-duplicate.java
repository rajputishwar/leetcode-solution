class Solution {
    public boolean containsDuplicate(int[] nums) {
        int xor = 0;

        for(int i = 1;i<nums.length;i++){
            xor^=1;
        }

        for(int i = 0 ;i<nums.length;i++){
            xor^=nums[i];
        }

        if(xor!=0){
            return false;
        }


        return true;
    }
}