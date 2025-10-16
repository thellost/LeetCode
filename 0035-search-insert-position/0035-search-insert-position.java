class Solution {
    public int searchInsert(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;

            // Index of Element Returned
            if (nums[m] == target) {
                return m;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            // so we decrease our r pointer to mid - 1 
            } else if (nums[m] > target) {
                r = m - 1;

            // Else the element can only be present
            // in right subarray
            // so we increase our l pointer to mid + 1
            } else {
              l = m + 1;
            }  
        }

        // No Element Found
        return l;
    }
}