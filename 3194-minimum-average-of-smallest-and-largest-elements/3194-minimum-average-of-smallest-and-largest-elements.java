class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        double minAvg = Double.MAX_VALUE;

        int start = 0;
        int end = nums.length - 1;
        for (int i = 0; i < (nums.length / 2); i++) {
            double min = (nums[start] + nums[end]) / 2.0;

            if (min < minAvg) {
                minAvg = min;
            }

            start++;
            end--;
        }

        return minAvg;
    }
}