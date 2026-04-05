// LeetCode 367: Valid Perfect Square
// Topic: Binary Search
// Time Complexity: O(log n)

class Solution {
    public boolean isPerfectSquare(int num) {
        long str = 1, end = num;

        while (str <= end) {
            long mid = str + (end - str) / 2;
            long sq = mid * mid;

            if (sq == num) {
                return true;
            } else if (sq < num) {
                str = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}