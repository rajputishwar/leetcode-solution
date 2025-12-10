class Solution {
    public int[] countBits(int n) {

        int res[] = new int [n+1];

        res[0] = 0;

        for(int i = 1;i<=n;i++){
            String binary_String = Integer.toBinaryString(i);
            res[i] = count1(binary_String);
        }

        return res;
        
    }

    public static int count1(String s){
        int count = 0;

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }

        return count;
    }
}