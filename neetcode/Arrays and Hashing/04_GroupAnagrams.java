class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<String,List<String>>();
        for(String str:strs)
        {
            char hash[]=new char[26];
            for(char c: str.toCharArray())
            {
                hash[c-'a']++;
            }
            String key=new String(hash);
            map.computeIfAbsent(key, k->new ArrayList<String>());
            map.get(key).add(str);
        }
        return new ArrayList<List<String>>(map.values());
    }
}