class Solution {
    public int characterReplacement(String s, int k) {
         int freq[] = new int[26];
         int left = 0;
         int maxcount =0;
         int maxlen = 0;

        for(int right=0;right<s.length();right++){
           int idx = s.charAt(right)-'A';
           freq[idx]++;

           if(freq[idx]>maxcount){
            maxcount = freq[idx];
           }

           while((right-left+1)-maxcount > k){
            freq[s.charAt(left)-'A']--;
            left++;
           }


           maxlen = Math.max(maxlen,right-left+1);
        }

              return maxlen;
    }
}