class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");

        StringBuilder newTitle = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 2) {
                newTitle.append(word.toLowerCase());
            } else {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWords = word.substring(1).toLowerCase();
                newTitle.append(firstChar).append(restOfWords);
            }

            if (i < words.length - 1) {
                newTitle.append(" ");
            }
        }

        return newTitle.toString();
    }
}