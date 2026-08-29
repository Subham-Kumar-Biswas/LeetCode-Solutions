class Solution {
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
}