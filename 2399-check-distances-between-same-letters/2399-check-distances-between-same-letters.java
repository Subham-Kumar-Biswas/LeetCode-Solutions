class Solution {

    // Time Complexity: O(N)
    public boolean checkDistances(String s, int[] distance) {
        int[] firstSeen = new int[26];
        Arrays.fill(firstSeen, -1);

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';

            if (firstSeen[idx] == -1) {
                firstSeen[idx] = i;
            } else {
                int actualIndex = i - firstSeen[idx] - 1;
                if (distance[idx] != actualIndex) {
                    return false;
                }
            }
        }

        return true;
    }
    

    /*
    Time Complexity: O(N^2)
    public boolean checkDistances(String s, int[] distance) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (s.indexOf(ch) == i) {
                int count = 0;

                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == ch) {
                        break;
                    }
                    count++;
                }

                if (distance[ch - 'a'] != count) {
                    return false;
                }
            }
            
        }

        return true;
    }

    */
}