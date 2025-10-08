class Solution {

    // Merge two sorted halves into ascending order
    public void conqure(int[] arr, int start, int mid, int end){
        int[] merge = new int[end - start + 1]; // temporary array
        int k = 0;
        int idx1 = start, idx2 = mid + 1;

        // Merge both halves while maintaining ascending order
        while(idx1 <= mid && idx2 <= end){
            if(arr[idx1] < arr[idx2]) merge[k++] = arr[idx1++];
            else merge[k++] = arr[idx2++];
        }

        // Copy remaining elements of left half
        while(idx1 <= mid){
            merge[k++] = arr[idx1++];
        }

        // Copy remaining elements of right half
        while(idx2 <= end){
            merge[k++] = arr[idx2++];
        }

        // Copy merged result back to original array
        for(int i = 0, j = start; i < merge.length; i++, j++){
            arr[j] = merge[i];
        }
    }

    // Divide array recursively (standard merge sort)
    public void divide(int[] arr, int start, int end){
        if(start >= end) return;
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conqure(arr, start, mid, end);
    }

    // Main function for Number Game
    public int[] numberGame(int[] nums) {
        // Step 1: Sort using merge sort
        divide(nums, 0, nums.length - 1);

        // Step 2: Swap every pair of adjacent elements
        for(int i = 0; i < nums.length; i += 2){
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }

        // Step 3: Return modified array
        return nums;
    }
}