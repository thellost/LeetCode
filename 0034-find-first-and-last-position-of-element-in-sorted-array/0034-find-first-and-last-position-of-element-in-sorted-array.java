class Solution {
    public int[] searchRange(int[] nums, int target) {
        int index = binarySearch(nums, target);
        int l = index;
        int r = index;

        if(index == -1){
            
        return new int[]{-1, -1};
        }
        //check right
        while(r < nums.length-1 && nums[r+1] == target){
            r++;
        }

        //check left
        
        while(l > 0 && nums[l-1] == target){
            l--;
        }

        return new int[]{l, r};
    }



    public int binarySearch(int[] nums, int target){
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
        return -1;
    }
}