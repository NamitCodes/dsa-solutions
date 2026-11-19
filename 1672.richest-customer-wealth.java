/*
 * @lc app=leetcode id=1672 lang=java
 *
 * [1672] Richest Customer Wealth
 */

// @lc code=start
class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int ans = 0;

        for (int i = 0; i < n; i++){
            int sum = 0;
            int m = accounts[i].length;
            for (int j = 0; j < m; j++){
                sum += accounts[i][j];
            }
            if (sum > ans) ans = sum;
        }

        return ans;
    }
}
// @lc code=end

