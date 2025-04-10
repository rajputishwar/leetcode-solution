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

    int sum(int arr[]){
       int sum=0;
        for(int i = 0 ; i < arr.length;i++){
          sum+=arr[i];
        }

        return sum;
    }

int Days(int[] arr, int cap){
    int load = 0;
    int day = 1;

    for(int i = 0; i<arr.length ; i++){
        if(load+arr[i]>cap){
            day+=1;
            load = arr[i];
        }
        else{
            load+=arr[i];
        }
    }
    return day;
}

    public int shipWithinDays(int[] weights, int days) {
        int low = findmax(weights);
        int high = sum(weights);

        while(low<=high){
            int mid = low + (high-low)/2;
            int totaldays= Days(weights,mid);

            if(totaldays<=days){
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }
        }
        
        return low;
    }
}