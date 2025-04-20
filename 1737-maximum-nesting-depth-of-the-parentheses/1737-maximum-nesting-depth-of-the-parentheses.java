class Solution {
    public int maxDepth(String s) {
       Stack<Character> st = new Stack<>();
        int c = 0;

        for(char ch : s.toCharArray()){
            if(ch=='('){
                st.push(ch);
                c  = Math.max(c,st.size());
            }
                else if (ch == ')') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
        }

        return c;
    }
}