class Solution {
    int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low; // 'low' is the first index with arr[low] >= target
    }
}