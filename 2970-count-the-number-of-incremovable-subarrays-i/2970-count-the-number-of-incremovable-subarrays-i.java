class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(isValid(nums, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isValid(int[] nums, int start, int end) {
        int prev = -1;

        for (int k = 0; k < nums.length; k++) {
            if (k >= start && k <= end) continue;

            if (nums[k] <= prev) return false;

            prev = nums[k];
        }

        return true;
    }
}