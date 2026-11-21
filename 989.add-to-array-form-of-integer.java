/*
 * @lc app=leetcode id=989 lang=java
 *
 * [989] Add to Array-Form of Integer
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {
            int sum = num[i] + k;
            ans.add(sum % 10);

            k = sum / 10;
        }

        while (k > 0) {
            ans.add(k % 10);
            k /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }
}
// @lc code=end
