class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int Switch = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[Switch];
                nums[Switch] = temp;
                Switch++;
            }
        }
        return nums;
    }
}