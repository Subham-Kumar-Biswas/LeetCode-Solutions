class Solution {
    public int minimizedStringLength(String s) {
        boolean[] chars = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            chars[c - 'a'] = true;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (chars[i]) {
                count++;
            }
        }

        return count;
    }
}