/*
 * @lc app=leetcode id=1480 lang=java
 *
 * [1480] Running Sum of 1d Array
 */

// @lc code=start
class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j = 0; j <= i; j++){
                sum += nums[j];
            }
            ans[i] = sum;
        }

        return ans;
    }
}
// @lc code=end

