class Solution {
    public int majorityElement(int[] nums) {
        int maxNum = nums[0];
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                maxNum = nums[i];
                count = 1;
            } else if(nums[i] == maxNum) {
                count++;
            } else {
                count--;
            }
        }
        return maxNum;
    }
}