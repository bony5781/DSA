
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long maxSoFar = 0;
        long max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            maxSoFar += arr[i];
            if(maxSoFar > max){
                max = maxSoFar;
            }
            if(maxSoFar < 0){
                maxSoFar = 0;
            }
        }
        
        return max;
        
    }
    
}