class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean[] exists = new boolean[1001];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 1000) {
                exists[nums[i]] = true;
            } 
        }
        while (original <= 1000 && exists[original]) {
            original *= 2;
        }
        return original;
    }
}