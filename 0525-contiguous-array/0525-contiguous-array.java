class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int count = 0;
        int maxLength = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                count--;
            } else {
                count++;
            }

            if (map.containsKey(count)) {
                int i = map.get(count);
                maxLength = Math.max(maxLength, j - i);
            } else {
                map.put(count, j);
            }
        }

        return maxLength;
    }
}