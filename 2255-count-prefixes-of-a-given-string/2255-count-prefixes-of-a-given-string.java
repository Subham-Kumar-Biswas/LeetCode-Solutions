class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;

        for (String word : words) {
            if (s.length() < word.length()) continue;

            boolean isPrefix = true;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != s.charAt(i)) {
                    isPrefix = false; 
                    break;
                } 
            }

            if (isPrefix) count++;
        }

        return count;
    }
}