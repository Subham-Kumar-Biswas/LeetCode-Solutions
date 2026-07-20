class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];

        Arrays.sort(nums);

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[index] = nums[i + 1];
            arr[index + 1] = nums[i];

            index += 2;
            i++;
        }

        return arr;
    }
}