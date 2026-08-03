class Solution {
    public String reversePrefix(String word, char ch) {
        int targetIndex = word.indexOf(ch);

        if (targetIndex == -1) {
            return word;
        }

        StringBuilder prefix = new StringBuilder(word.substring(0, targetIndex + 1));
        prefix.reverse();

        String remainder = word.substring(targetIndex + 1);

        return prefix.append(remainder).toString();
    }
}