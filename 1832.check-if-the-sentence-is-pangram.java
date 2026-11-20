/*
 * @lc app=leetcode id=1832 lang=java
 *
 * [1832] Check if the Sentence Is Pangram
 */

// @lc code=start
class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alphabetArray = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            int idx = sentence.charAt(i) - 'a';
            alphabetArray[idx]++;
        }

        for (int alpha : alphabetArray) {
            if (alpha == 0)
                return false;
        }

        return true;
    }
}
// @lc code=end
