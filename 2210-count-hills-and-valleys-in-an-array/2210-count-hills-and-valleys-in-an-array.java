class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int prev = nums[0];

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if (nums[i] > prev && nums[i] > nums[i + 1]) {
                count++;
            } else if (nums[i] < prev && nums[i] < nums[i + 1]) {
                count++;
            }

            prev = nums[i];
        }
 
        return count;
    }
        
    /* public int countHillValley(int[] nums) {
        List<Integer> newNums = new ArrayList<>();
        newNums.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                newNums.add(nums[i]);
            }
        }

        int count = 0;

        for (int i = 1; i < newNums.size() - 1; i++) {
            if (newNums.get(i) > newNums.get(i - 1) && newNums.get(i) > newNums.get(i + 1)) {
                count++;
            } else if (newNums.get(i) < newNums.get(i - 1) && newNums.get(i) < newNums.get(i + 1)) {
                count++;
            }
        }

        return count;
    } */
}
