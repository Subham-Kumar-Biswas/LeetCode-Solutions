class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length - 2;
        boolean[] seen = new boolean[n];
        int[] result = new int[2];
        int j = 0;
        for (int x : nums) {
            if (seen[x]) {
                result[j++] = x;
                if (j == 2) break;
            } else {
                seen[x] = true;
            }
        }
        return result;
    }
}