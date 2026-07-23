class Solution {
    public void moveZeroes(int[] nums) {
        int countNonZeros = 0;
        int countZeros = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[countNonZeros] = nums[i];
                countNonZeros++;
            } else {
                countZeros++;
            }
        }

        while(countZeros > 0) {
            nums[nums.length - countZeros] = 0;
            countZeros--;
        }
    }
}