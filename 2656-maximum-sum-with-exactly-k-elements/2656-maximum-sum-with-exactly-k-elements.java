class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }        

        int sum = max;
        int currentNum = max;
        for  (int i = 1; i < k; i++) {
            currentNum++;
            sum += currentNum;
        }

        return sum;
    }
}