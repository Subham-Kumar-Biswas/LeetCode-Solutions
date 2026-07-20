class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabets = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            alphabets[magazine.charAt(i) - 'a']++;
        }

        for (int j = 0; j < ransomNote.length(); j++) {
            alphabets[ransomNote.charAt(j) - 'a']--;
        }

        for (int k = 0; k < alphabets.length; k++) {
            if(alphabets[k] < 0) {
                return false;
            }
        }
        return true;
    }
}