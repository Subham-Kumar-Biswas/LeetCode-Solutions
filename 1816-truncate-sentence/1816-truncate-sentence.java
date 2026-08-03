class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");

        StringBuilder truncate = new StringBuilder();
        for(int i = 0; i < k; i++) {
            if (i > 0) {
                truncate.append(" ");
            }
            truncate.append(words[i]);
        }

        return truncate.toString();
    }
}