class Solution {
    public int findGCD(int[] nums) {

        int a =  min(nums);
        int b = max(nums);
       

        while(b!=0){
           int temp = b;
            b = a%b;
             a = temp;
            
        }


    return a;
        
    }

    static int min(int nums[]){
        int a = Integer.MAX_VALUE;

        for(int i = 0;i<nums.length;i++){
            if(nums[i]<a){
                a = nums[i];
            }
        }

        return a;
    }

    
    static int max(int nums[]){
        int b = Integer.MIN_VALUE;

        for(int i = 0;i<nums.length;i++){
            if(nums[i]>b){
                b = nums[i];
            }
        }

        return b;
    }
}