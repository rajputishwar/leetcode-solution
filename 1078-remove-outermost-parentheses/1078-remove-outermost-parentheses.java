class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        int i = 0;
          StringBuilder result=new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch=='('){
            
                if(count>0){
                    result.append(ch);
                }
                count++;
            }

            else{
                count--;
                if(count>0){
                    result.append(ch);
                }
               
            }
            i++;
        }

        return result.toString();
    }
}