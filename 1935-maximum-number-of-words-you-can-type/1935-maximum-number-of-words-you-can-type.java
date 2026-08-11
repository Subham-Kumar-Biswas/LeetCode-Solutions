class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] isBroken = new boolean[26];
        for (char c : brokenLetters.toCharArray()) {
            isBroken[c - 'a'] = true;
        }

        String[] words = text.split(" ");
        int typableCount = 0;

        for (String word : words) {
            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (isBroken[c - 'a']) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                typableCount++;
            }
        }

        return typableCount;
    }
}