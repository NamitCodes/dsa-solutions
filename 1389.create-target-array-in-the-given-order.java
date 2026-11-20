/*
 * @lc app=leetcode id=1389 lang=java
 *
 * [1389] Create Target Array in the Given Order
 */

// @lc code=start
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        int i = 0;
        int size = 0;
        for (int idx : index) {
            if (idx <= size) {
                // everything from idx to size is shifted.
                for (int j = size; j > idx; j--) {
                    target[j] = target[j - 1];
                }
            }

            target[idx] = nums[i];
            i++;
            size++;
        }
        /*
         * target nums index index[0] = 0
         * 0 0 0
         * 0,1 1 1 index[1] = 1
         * 0,1,2 2 2 index[2] = 2
         * 0,1,3,2 3 2 index[2] = 2
         * 0,4,1,3,2 4 1 index[1] = 1
         */

        return target;
    }
}
// @lc code=end
