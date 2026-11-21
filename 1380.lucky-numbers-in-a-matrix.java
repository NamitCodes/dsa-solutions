/*
 * @lc app=leetcode id=1380 lang=java
 *
 * [1380] Lucky Numbers in a Matrix
 */

// @lc code=start

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        // min in its row and max in its col

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minRow = matrix[i][0];
            int minRowCol = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                    minRowCol = j;
                }
            }
            // find col of minRow
            int maxCol = matrix[0][minRowCol];
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minRowCol] > maxCol)
                    maxCol = matrix[k][minRowCol];
            }

            if (minRow == maxCol)
                arr.add(minRow);

        }

        return arr;
    }
}
// @lc code=end
