/*
 * @lc app=leetcode id=1252 lang=java
 *
 * [1252] Cells with Odd Values in a Matrix
 */

// @lc code=start
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        int odd = 0;

        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];

            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++) {
                    if (i == row)
                        ans[i][j]++;
                    if (j == col)
                        ans[i][j]++;
                }
            }
        }

        for (int[] ans_row : ans) {
            for (int num : ans_row) {
                if (num % 2 == 1)
                    odd++;
            }
        }

        return odd;
    }
}
// @lc code=end
