class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> stMap = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String str = String.valueOf(arr);
            List<String> lst = stMap.getOrDefault(str, new ArrayList<String>());
            lst.add(s);
            stMap.put(str, lst);
        }
        return new ArrayList<>(stMap.values());
    }
}
