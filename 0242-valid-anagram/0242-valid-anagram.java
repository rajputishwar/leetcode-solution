class Solution {
    public boolean isAnagram(String s, String t) {

 if(s.length()!=t.length()){
    return false;
 }

 int freq[] = new int[256];

 for(int i = 0;i<s.length();i++){
    freq[s.charAt(i)-0]++;
    freq[t.charAt(i)-0]--;
 }

 for(int i = 0;i<freq.length;i++){
    if(freq[i]!=0){
        return false;
    }
 }

 return true;
    }
}