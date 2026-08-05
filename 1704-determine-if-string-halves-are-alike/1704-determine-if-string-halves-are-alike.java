class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int count = 0;

        String vowels = "aeiouAEIOU";

        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }

            if (vowels.indexOf(s.charAt(i + n / 2)) != -1) {
                count--;
            }
        }

        return count == 0;
    }

    /* public boolean halvesAreAlike(String s) {
        int n = s.length();
        int a = 0;
        int b = 0;

        String vowels = "aeiouAEIOU";

        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                a++;
            }
        }

        for (int i = (n / 2); i < n; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                b++;
            }
        }

        return a == b;
    } */
}