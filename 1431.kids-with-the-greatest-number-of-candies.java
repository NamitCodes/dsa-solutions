/*
 * @lc app=leetcode id=1431 lang=java
 *
 * [1431] Kids With the Greatest Number of Candies
 */

// @lc code=start
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> ans = new ArrayList<>();

        int max = 0;
        for (int i = 0; i < candies.length; i++){
            if (candies[i] > max) max = candies[i];
        }

        for (int i = 0; i < candies.length; i++){
            boolean temp = (candies[i] + extraCandies >= max) ? true : false;
            ans.add(temp);
        }

        return ans;
        
    }
}
// @lc code=end

