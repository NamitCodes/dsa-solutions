/*
 * @lc app=leetcode id=1304 lang=java
 *
 * [1304] Find N Unique Integers Sum up to Zero
 */

// @lc code=start
class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];

        if (n == 1)
            return ans;

        if (n % 2 == 0) {
            for (int i = 0; i < ans.length; i += 2) {
                ans[i] = i + 1;
                ans[i + 1] = -1 * ans[i];
            }
        } else {
            ans[0] = 0;
            for (int i = 1; i < ans.length; i += 2) {
                ans[i] = i;
                ans[i + 1] = -1 * ans[i];
            }
        }
        return ans;

    }
}
// @lc code=end
