class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        int currentLeftSum = 0;
        int currentRightSum = 0;

        for (int i = 0; i < nums.length; i++) {
            leftSum[i] = currentLeftSum;
            rightSum[nums.length - 1 - i] = currentRightSum;

            currentLeftSum += nums[i];
            currentRightSum += nums[nums.length - 1 - i];
        }
        
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}