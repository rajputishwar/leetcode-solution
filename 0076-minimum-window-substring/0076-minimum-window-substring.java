class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int l = 0;
        int r = 0;
        int sIndx = -1;
        int count = 0;
        int minlen = Integer.MAX_VALUE;
        int hash[] = new int[256];

           if(m > n){
            return "";
           }

        Arrays.fill(hash,0);

        for(int i = 0;i<m;i++){
            hash[t.charAt(i)]++;
        }

        while(r<n){
            if(hash[s.charAt(r)]>0){
                count++;
            }
                hash[s.charAt(r)]--;
       

       while(count==m){
        if((r-l+1)<minlen){
            minlen = r-l+1;
            sIndx =  l;
        }

        hash[s.charAt(l)]++;

        if(hash[s.charAt(l)]>0){
            count-=1;
        }
        l++;
       }
       r++;
        }

        return sIndx == -1 ? "":s.substring(sIndx,sIndx+minlen);
    }
}