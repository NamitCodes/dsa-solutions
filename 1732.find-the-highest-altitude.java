/*
 * @lc app=leetcode id=1732 lang=java
 *
 * [1732] Find the Highest Altitude
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length + 1];
        alt[0] = 0;
        int ans = 0;

        int j = 1;
        for (int i = 0; i < gain.length; i++) {
            alt[j] = alt[j - 1] + gain[i];
            if (alt[j] > ans)
                ans = alt[j];
            j++;
        }
        return ans;
    }
}
// @lc code=end
