/*
 * @lc app=leetcode id=1854 lang=java
 *
 * [1854] Maximum Population Year
 */

// @lc code=start
class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];

        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0] - 1950; j < logs[i][1] - 1950; j++) {
                arr[j]++;
            }
        }

        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        return maxIndex + 1950;
    }
}
// @lc code=end
