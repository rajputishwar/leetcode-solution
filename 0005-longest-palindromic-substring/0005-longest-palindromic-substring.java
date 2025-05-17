class Solution {
    int st , end ,max =0;

    public boolean ispalindrome(String s,int i,int j){
       
        while(i<j){
             int c1 = s.charAt(i);
            int c2 = s.charAt(j);

            if(c1!=c2){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
    public String longestPalindrome(String s) {
        for(int i = 0; i<s.length();i++){
            for(int j = i;j<s.length();j++){
                if(ispalindrome(s,i,j)){
                    if(j-i+1>max){
                        max = j-i+1;
                        st = i;
                        end = j;
                    }
                }
            }
        }


     return  s.substring(st,end+1);
    }
}