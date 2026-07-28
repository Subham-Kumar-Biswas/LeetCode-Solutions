class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] frequency = new int[101];
        int totalGroup = 0;
        for(int num : nums) {
            totalGroup += frequency[num];

            frequency[num]++;
        }
        return totalGroup;
    }
}