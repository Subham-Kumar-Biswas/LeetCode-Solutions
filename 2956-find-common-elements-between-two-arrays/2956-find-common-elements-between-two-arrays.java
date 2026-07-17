class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] f1 = new boolean[101];
        boolean[] f2 = new boolean[101];

        for (int i = 0; i < (Math.max(nums1.length, nums2.length)); i++) {
            if (i < nums1.length) {
                f1[nums1[i]] = true; 
            }
            if(i < nums2.length) {
                f2[nums2[i]] = true; 
            }
        }

        int answer1 = 0;
        int answer2 = 0;

        for (int i = 0; i < (Math.max(nums1.length, nums2.length)); i++) {
            if (i < nums1.length && f2[nums1[i]]) {
                answer1++;
            }
            if (i < nums2.length && f1[nums2[i]]) {
                answer2++;
            }
        }

        return new int[]{answer1, answer2};
    }
}