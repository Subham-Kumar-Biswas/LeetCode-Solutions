class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int minVal = nums[0];
        int maxVal = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
            } 
            if (nums[i] < minVal) {
                minVal = nums[i];
            }
        }    

        int score = (maxVal - k) - (minVal + k);

        return Math.max(0, score);  
    }
}