class Solution {
    public boolean isAnagram(String s, String t) {
        int arrS[] = new int[26];
        for (char c : s.toCharArray()) {
            arrS[c - 'a']++;
        }
        int arrT[] = new int[26];
        for (char c : t.toCharArray()) {
            arrT[c - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (arrS[i] != arrT[i]) {
                return false;
            }
        }
        return true;
    }
}
