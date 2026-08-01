class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> distinctNums = new ArrayList<>();

        int[] mask = new int[101];

        for (int num : nums1) mask[num] |= 1;
        for (int num : nums2) mask[num] |= 2;
        for (int num : nums3) mask[num] |= 4;

        for (int i = 1; i <= 100; i++) {
            if (mask[i] == 3 || mask[i] == 5 || mask[i] == 6 || mask[i] == 7) {
                distinctNums.add(i);
            }
        }

        return distinctNums;
    }
}