class Solution {
    public int countValidWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        int tokens = 0;

        String regex = "[a-z]*([a-z]+-[a-z]+)?[a-z]*[!.,]?";

        for (String word : words) {
            if (word.length() > 0 && word.matches(regex)) {
                tokens++;
            }
        }

        return tokens;
    }
}