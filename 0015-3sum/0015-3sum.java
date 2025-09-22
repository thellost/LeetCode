class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int k = nums.length - 1;
            int j = i + 1 ;


            while(j<k){
                int total = nums[i] + nums[j] + nums[k];

                if ( total> 0){
                    k--;
                } else if ( total < 0){
                    j++;
                } else {
                    System.out.println(" " + i + " " + j + " "  + k);
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while(nums[j] == nums[j-1] && j<k){
                        j++;
                    }
                }
            }

            
        }
        return result;
    }

     // partition function
    static int partition(int[] arr, int low, int high) {
        
        // choose the pivot
        int pivot = arr[high];
        
        // index of smaller element and indicates 
        // the right position of pivot found so far
        int i = low - 1;

        // traverse arr[low..high] and move all smaller
        // elements to the left side. Elements from low to 
        // i are smaller after every iteration
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        
        // Move pivot after smaller elements and
        // return its position
        swap(arr, i + 1, high);  
        return i + 1;
    }

    // swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // the QuickSort function implementation
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            
            // pi is the partition return index of pivot
            int pi = partition(arr, low, high);

            // recursion calls for smaller elements
            // and greater or equals elements
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}