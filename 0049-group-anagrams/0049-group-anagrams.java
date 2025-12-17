class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
         Map<String,List <String>> hashmap = new HashMap<>();

         for(String str : strs){
            String freq = getfreq(str);

            if(hashmap.containsKey(freq)){
                hashmap.get(freq).add(str);
            }


            else{
                List<String> strList = new ArrayList<>();

                strList.add(str);

                hashmap.put(freq,strList);
            }
         }

         return new ArrayList<>(hashmap.values());
         
    }

    public static String getfreq(String str){
        int freq[] = new int[26];

        for(char c:str.toCharArray()){
            freq[c-'a']++;
        } 
     StringBuilder sb = new StringBuilder(" ");
     char c = 'a';
        for(int i : freq){
            sb.append(c);
            sb.append(freq[c-'a']);
            c++;
        }

        return sb.toString();
    }
}