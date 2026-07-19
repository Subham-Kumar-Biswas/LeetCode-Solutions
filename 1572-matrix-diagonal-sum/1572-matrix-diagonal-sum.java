class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i = 0; i < mat.length; i++) {
            sum += mat[i][i];

            sum += mat[i][n - 1 -i];
        }

        if(n % 2 != 0) {
            int mid = n/2;
            sum -= mat[mid][mid];
        }
        return sum;
    }
}