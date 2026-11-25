class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        boolean[] seen = new boolean[101];
        int[] result = new int[2];
        int idx = 0;


        for (int i = 0; i < nums.length; i++) {
            if  (seen[nums[i]]) {
                result[idx++] = nums[i];
                if (idx == 2) break;
            } else {
                seen[nums[i]] = true;
            }

        }

        return result;
    }
}