class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] count = new int[1001];

        for (int[] arr : nums) {
            for (int num : arr) {
                count[num]++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        int targetCount = nums.length;

        for (int i = 0; i < 1001; i++) {
            if (count[i] == targetCount) {
                ans.add(i);
            }
        }

        return ans;
    }
}