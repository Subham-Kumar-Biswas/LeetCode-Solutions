class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] counts = new int[26];
        
        for (int i = 0; i < text.length(); i++) {
            counts[text.charAt(i) - 'a'] += 1; 
        }

        int b = counts['b' - 'a'];
        int a = counts['a' - 'a'];
        int l = counts['l' - 'a'] / 2;
        int o = counts['o' - 'a'] / 2;
        int n = counts['n' - 'a'];

        int min = b;
        for (int count : new int[]{a, l, o, n}) {
            min = Math.min(min, count);
        }

        return min;
    }
}