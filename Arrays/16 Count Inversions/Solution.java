class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    public static long merge(long arr[], int low, int mid, int high){
        long arr2[] = new long[high - low +1];
        int left = low;
        int right = mid + 1;
        long count = 0;
        int  k = 0;
        
        while(left <= mid && right <= high){
            if(arr[left] <= right){
                arr2[k++] = arr[left++];
            }else{
                arr2[k++] = arr[right++];
                count += (mid - left + 1);
            }
        }
        
        while(left <= mid){
            arr2[k++] = arr[left++];
        }
        
        while(right <= high){
            arr2[k++] = arr[right++];
        }
        
        for(int i = 0, j = low; i < arr2.length; i++){
            arr[j++] = arr2[i];
        }
        
        return count;
    }
    
    public static long mergeSort(long arr[],int low,int high){
        if(low > high){
            int mid = low + (high - low)/2;
            long count1 = mergeSort(arr, low, mid);
            long count2 = mergeSort(arr, mid+1, high);
            long count3 = merge(arr, low, mid, high);
            return (count1 + count2 + count3);
        }else{
            return 0;
        }
    }
    
    
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return mergeSort(arr, 0, (int)N-1);
    }
}