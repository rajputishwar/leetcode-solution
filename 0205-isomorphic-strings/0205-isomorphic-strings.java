class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Character> map = new HashMap<>();

        for(int i = 0; i < s.length();i++){
            char org = s.charAt(i);
            char rep = t.charAt(i);
            if(!map.containsKey(org)){
              if (map.containsValue(rep)) {
                   
                    return false;
                }
                    map.put(org,rep);
                
            }
            else{
                char mapped = map.get(org);
                if(mapped!=rep){
                    return false;
                }
            }
        }

        return true;
    }
}