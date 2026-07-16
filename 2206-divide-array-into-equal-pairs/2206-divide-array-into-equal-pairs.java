class Solution {
    public boolean divideArray(int[] nums) {
        int[] isEqual = new int[501];

        for (int i = 0; i < nums.length; i++) {
            isEqual[nums[i]] += 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (isEqual[nums[i]] % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}