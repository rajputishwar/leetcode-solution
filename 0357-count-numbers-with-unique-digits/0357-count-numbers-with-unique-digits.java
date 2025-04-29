class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }

        if(n>10){
            n =10;
        }

        int product = 9;
        int total = 10;
        int availabledigit = 9;

        
        for(int i = 2; i<=n;i++){
            product*=availabledigit;
            total+=product;
            availabledigit--;
                    }

      return total;
    }
}