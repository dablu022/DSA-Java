class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length, str = 0, end = n - 1, neg = 0, pos = 0;
    if(nums[n-1]<0) return n;
    if(nums[0]>0) return n;
        while (str <= end) {
            int mid = str + (end - str) / 2;

            if (nums[mid] >= 0) {
                neg = mid;
                end = mid - 1;
            } else {
                str = mid + 1;
            }
        }

        int str1 = 0, end1 = n - 1;

        while (str1 <= end1) {
            int mid = str1 + (end1 - str1) / 2;

            if (nums[mid] > 0) {
                pos = n - mid;
                end1 = mid - 1;
            } else {
                str1 = mid + 1;
            }
        }

        return Math.max(neg, pos);
    }
}