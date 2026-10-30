class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            nums = getCurrentState(nums, multiplier);
        }

        return nums;

    }

    private static int[] getCurrentState(int[] n, int m) {
        int min = 0;

        for (int i = 1; i < n.length; i++) {
            if (n[i] < n[min]) {
                min = i;
            }
        }

        n[min] *= m;

        return n;
    }
}