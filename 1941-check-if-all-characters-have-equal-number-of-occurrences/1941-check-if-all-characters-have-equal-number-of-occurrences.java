class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] frequency = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequency[ch - 'a']++;
        }

        int targetFreq = frequency[s.charAt(0) - 'a'];

        for (int count : frequency) {
            if (count != 0 && count != targetFreq) return false;
        }

        return true;
    }
}