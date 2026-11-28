/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */

// @lc code=start

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c)
            return mat;

        int[][] ans = new int[r][c];
        int k = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int elem = mat[i][j];
                // how did we arrive to this
                ans[k / c][k % c] = elem;
                k++;
            }
        }

        return ans;
    }
}
// @lc code=end
