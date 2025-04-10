class Solution {
    int findmax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }

    long calculateTotalHours(int arr[] , int value){
        long sum = 0;

         for(int i = 0; i< arr.length ; i++){
            sum += (arr[i]+value-1)/value;
         }

         return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findmax(piles);

        while(low<=high){
           int mid = low + (high - low) / 2;


        long totalhour = calculateTotalHours(piles,mid);

            if(totalhour<=h){
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }
        }

        return low;
    }
}