class Solution {
    public int rearrangeCharacters(String s, String target) {
        int n = s.length();
        int m = target.length();

        int[] frequencyS = new int[26];
        int[] freqTarget = new int[26];

        for (int i = 0; i < n; i++) {
            frequencyS[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < m; i++) {
            freqTarget[target.charAt(i) - 'a']++;
        }

        int minCopies = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (freqTarget[i] > 0) {
                int possibleCopies = frequencyS[i] / freqTarget[i];
                minCopies = Math.min(minCopies, possibleCopies);
            }
        }

        return minCopies;
    }
}