class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int squaredSum = 0;
        for (int i = 0; i <= n; i++) {
            if (n % (i+1) == 0) {
                squaredSum += (nums[i] * nums[i]);
            }
        }

        return squaredSum;
    }
}