class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int l = 0;
        int r = 0;

        int m = s.length;
        int n = g.length;
        
        Arrays.sort(g);
        Arrays.sort(s);

        while(l<m){
            if(r < n && g[r]<=s[l]){
                r++;

            }

             l++;
        }

        return r;
    }
}