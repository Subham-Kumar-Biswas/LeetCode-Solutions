class Solution {
    public void sortColors(int[] nums) {
        int swappingIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == i) {
                    int temp = nums[j];
                    nums[j] = nums[swappingIndex];
                    nums[swappingIndex] = temp;
                    swappingIndex++;
                }
            }
        }
    }
}