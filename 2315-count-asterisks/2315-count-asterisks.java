class Solution {
    public int countAsterisks(String s) {
        String[] words = s.split("\\|");
        int starCount = 0;

        for(int i = 0; i < words.length; i += 2) {
            String word = words[i];

            for(int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == '*') {
                    starCount++;
                }
            }
        }

        return starCount;
    }
}