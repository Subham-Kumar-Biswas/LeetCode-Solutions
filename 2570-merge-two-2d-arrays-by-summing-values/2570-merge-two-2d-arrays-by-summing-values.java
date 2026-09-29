class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int p1 = 0, p2 = 0;

        int[][] temp = new int[n1 + n2][2];
        int k = 0;

        while (p1 < n1 && p2 < n2) {
            int id1 = nums1[p1][0], val1 = nums1[p1][1];
            int id2 = nums2[p2][0], val2 = nums2[p2][1];

            if (id1 == id2) {
                temp[k][0] = id1;
                temp[k][1] = val1 + val2;
                p1++;
                p2++;
            } else if (id1 < id2) {
                temp[k][0] = id1;
                temp[k][1] = nums1[p1][1];
                p1++;
            } else {
                temp[k][0] = id2;
                temp[k][1] = nums2[p2][1];
                p2++;
            }

            k++;
        }

        while (p1 < n1) {
            temp[k][0] = nums1[p1][0];
            temp[k][1] = nums1[p1][1];
            p1++;
            k++;
        }

        while (p2 < n2) {
            temp[k][0] = nums2[p2][0];
            temp[k][1] = nums2[p2][1];
            p2++;
            k++;
        }

        int[][] ans = new int[k][2];
        System.arraycopy(temp, 0, ans, 0, k);

        return ans;
    }
}