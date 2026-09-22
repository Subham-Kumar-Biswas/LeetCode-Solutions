class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int smallerCount = 0;
        int equalCount = 0;

        for (int num : nums) {
            if (num < target) {
                smallerCount++;
            } else if (num == target) {
                equalCount++;
            }
        }

        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < equalCount; i++) {
            indices.add(smallerCount + i);
        }

        return indices;
    }
}