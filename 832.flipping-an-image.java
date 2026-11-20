/*
 * @lc app=leetcode id=832 lang=java
 *
 * [832] Flipping an Image
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // reverse each row
        // replace each 0 with 1 and vice versa

        int[][] ans = new int[image.length][image.length];

        for (int i = 0; i < image.length; i++) {
            int t = image[i].length;
            for (int j = 0; j < image[i].length; j++) {
                ans[i][t - 1] = image[i][j];
                if (ans[i][t - 1] == 0) {
                    ans[i][t - 1] = 1;
                } else {
                    ans[i][t - 1] = 0;
                }
                t--;
            }
        }

        return ans;

    }
}
// @lc code=end
