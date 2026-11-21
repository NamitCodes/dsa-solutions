/*
 * @lc app=leetcode id=1886 lang=java
 *
 * [1886] Determine Whether Matrix Can Be Obtained By Rotation
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target))
                return true;
            mat = ninety(mat);
        }
        return false;
    }

    private int[][] ninety(int[][] mat) {
        int[][] ans = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            int k = mat.length - 1;
            for (int j = 0; j < mat[i].length; j++) {
                ans[i][j] = mat[k][i];
                k--;
            }
        }

        return ans;
    }

}
// @lc code=end

// private int[][] oneeighty(int[][] mat) {
// int[][] ans = new int[mat.length][mat.length];
// for (int i = 0; i < mat.length; i++) {
// int k = mat.length - 1;
// for (int j = 0; j < mat[i].length; j++) {
// ans[i][j] = mat[mat.length - 1 - i][k];
// k--;
// }
// }

// return ans;
// }

// private int[][] twoseventy(int[][] mat) {
// int[][] ans = new int[mat.length][mat.length];
// for (int i = 0; i < mat.length; i++) {
// for (int j = 0; j < mat[i].length; j++) {
// ans[i][j] = mat[j][mat.length - 1 - i];
// }
// }
// return ans;
// }
