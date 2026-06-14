class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<String, List<String>>();

        for(String st: strs){
            int[] cnt = new int[26];
            for(char c: st.toCharArray()){
                cnt[c - 'a']++;
            }
            String key = Arrays.toString(cnt);
            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(st);
        }
        return new ArrayList<>(hm.values());
    }
}
