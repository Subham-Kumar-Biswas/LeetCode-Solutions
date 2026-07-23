class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder newS = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            newS.append(words[i]);
            if(i > 0) {
                newS.append(" ");
            }
        }
        return newS.toString();
    }
}