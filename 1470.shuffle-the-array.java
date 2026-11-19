/*
 * @lc app=leetcode id=1470 lang=java
 *
 * [1470] Shuffle the Array
 */

// @lc code=start
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        int i = 0; 
        int j = 0;
        while (i < nums.length){
            ans[i] = nums[j];
            j++;
            i+=2;
        }

        int k = n;
        int l = 1;
        while (k < nums.length){
            ans[l] = nums[k]; 
            l+=2;
            k++;
        }

        return ans;

    }
}
// @lc code=end

