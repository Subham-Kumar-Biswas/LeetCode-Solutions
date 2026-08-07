class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder(words.size());

        if (words.size() != s.length()) {
            return false;
        }

        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i).charAt(0));
        }

        if (sb.toString().equals(s)) {
            return true;
        }

        return false;
    }
}