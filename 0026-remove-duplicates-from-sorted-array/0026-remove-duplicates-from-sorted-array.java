class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int pointer = 0;

        for(int i = 0; i < nums.length; i++){
            if (i>0 && nums[i-1] == nums[i]){
            } else {
                nums[k] = nums[i];
                k++;
            }
        }


        return k;
    }
}