class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int low = 0, high = arr.length;
        
        while(low < high){
            int mid = low + (high - low) / 2;
            if(arr[mid] >  target){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return high;
    }
}
