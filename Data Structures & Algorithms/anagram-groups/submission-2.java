class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(Arrays.stream(strs)
            .collect(Collectors.groupingBy(s -> {
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                return new String(chars);
            }))
            .values());
    }
}
