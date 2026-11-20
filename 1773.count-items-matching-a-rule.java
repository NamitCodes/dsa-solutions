/*
 * @lc app=leetcode id=1773 lang=java
 *
 * [1773] Count Items Matching a Rule
 */

// @lc code=start

import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        for (List<String> item : items) {
            if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) {
                ans++;
            } else if (ruleKey.equals("color") && item.get(1).equals(ruleValue)) {
                ans++;
            } else if (ruleKey.equals("name") && item.get(2).equals(ruleValue)) {
                ans++;
            }
        }
        return ans;
    }
}
// @lc code=end
