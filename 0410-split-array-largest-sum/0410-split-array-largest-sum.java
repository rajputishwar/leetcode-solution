class Solution {
    boolean possible(int[] nums, int k , int mid){
        int split = 1; int sum = 0;

        for(Integer num : nums){
            if(num+sum<=mid){
                sum+=num;

            }

            else{
                sum  = num ;
                split+=1;

                if(split>k){
                    return false;
                }
            }

            
        }

         return true;
    }
    
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;


        for(int i =  0 ; i< nums.length; i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }


        while(low<=high){
            int mid = low + (high-low)/2;

            if(possible(nums,k,mid)){
                high = mid -1;

            }

            else{
                low = mid + 1;
            }
        }


        return low;
    }
}