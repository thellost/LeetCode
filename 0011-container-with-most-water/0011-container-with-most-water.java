class Solution {
    public int maxArea(int[] height) {
        if(height.length < 2){
            return 0;
        }
        int right = height.length-1;
        int largest = 0;
        int area;
        for (int left = 0; left < height.length ; left++ ){
            
            area = Math.min(height[left], height[right]) * (right-left);
            if(area > largest){
                largest = area;
            }

            while(height[left] > height[right]){
                right--;

                area = Math.min(height[left], height[right]) * (right-left);
                if(area > largest){
                    largest = area;
                }
            }

            if(left == right ){
                break;
            }
        }

        return largest;

    }
}