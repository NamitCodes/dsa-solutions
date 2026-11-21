/*
 * @lc app=leetcode id=1295 lang=java
 *
 * [1295] Find Numbers with Even Number of Digits
 */

// @lc code=start
class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            if (numOfDigitsEven(num))
                ans++;
        }
        return ans;
    }

    private boolean numOfDigitsEven(int num) {
        return ((int) Math.log10(num) + 1) % 2 == 0;
    }

}
// @lc code=end
