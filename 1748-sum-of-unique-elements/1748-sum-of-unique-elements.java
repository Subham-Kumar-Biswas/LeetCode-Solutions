class Solution {
    public int sumOfUnique(int[] nums) {
        int[] counts = new int[101];

        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
        }

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (counts[nums[i]] == 1) {
                sum += nums[i];
            }
        }
        return sum;
    }
}