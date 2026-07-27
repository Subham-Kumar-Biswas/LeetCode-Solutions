class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(int i = 0; i < sentences.length; i++) {
            String[] sentence = sentences[i].split(" ");
            if(sentence.length > maxWords) {
                maxWords = sentence.length;
            }
        }
        return maxWords;
    }
}