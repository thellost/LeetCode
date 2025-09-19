class Solution {
    public int trap(int[] height) {
        int total_area = 0;

        int highest = 0;
        int highest_index =0;
        int right = 1;
        if(height.length < 2){
            return 0;
        }

        for(int i = 0; i < height.length; i++){
            if(height[i] > highest){
                highest = height[i];
                highest_index = i;
            }
        }
        System.out.println(highest + " index :" + highest_index);
        for(int left = 0; left < highest_index; left++){

            while(right < height.length && height[right] < height[left]){
                total_area += (height[left] - height[right]);
                right++;
            }
            left = right - 1;
            
            right += 1;
            System.out.println("End valley !");

            
        }
        
        right = height.length-2;
        for(int left = height.length-1; left > highest_index; left--){


            while(right < height.length && height[right] < height[left]){
                total_area += (height[left] - height[right]);
                right--;
            }
            left = right + 1;
            
            right -= 1;

            
        }



        return total_area;
    }
}