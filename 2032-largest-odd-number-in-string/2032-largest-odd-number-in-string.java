class Solution {
    public String largestOddNumber(String num) {
        int length = num.length() -1;

        while(length>=0){
            int n = num.charAt(length)-'0';
            if(n%2!=0){
                return num.substring(0,length+1);
            }
            length--;
        }

         return "";
    }
}