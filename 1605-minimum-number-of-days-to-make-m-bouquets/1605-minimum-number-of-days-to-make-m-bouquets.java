class Solution {
    boolean possible(int arr[], int days, int m , int k){
        
        int count = 0;
  int noDays = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] <= days){
                count ++;
            }

            else{
               
                 noDays += (count/k); 
                  count = 0;
            }
        }

        noDays += (count/k); 

        if(noDays >= m){
            return true;
        }

        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        if(bloomDay.length < val){
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i = 0 ;i < bloomDay.length ; i++){
         low = Math.min(low,bloomDay[i]);
         high = Math.max(bloomDay[i], high);
        }

while(low <= high){
    int mid = low + (high - low)/2;

    if(possible(bloomDay,mid , m , k)){
        high = mid - 1;
    }

    else{
        low = mid  + 1;
    }
}


return low;
    }
}