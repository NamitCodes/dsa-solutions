/*
 * @lc app=leetcode id=1572 lang=java
 *
 * [1572] Matrix Diagonal Sum
 */

// @lc code=start
class Solution {
    public int diagonalSum(int[][] mat) {
        int start = 0;
        int end = mat.length - 1;
        int ans = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (j == start && j == end)
                    ans += mat[i][j];
                else if (j == start)
                    ans += mat[i][j];
                else if (j == end)
                    ans += mat[i][j];
            }
            start++;
            end--;
        }

        return ans;
    }
}
// @lc code=end
