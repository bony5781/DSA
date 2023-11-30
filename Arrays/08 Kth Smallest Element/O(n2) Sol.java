class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        int i,j,temp;
        int n = arr.length;
        boolean isSwapped;
        for(i = 0; i < n; i++){
            isSwapped = false;
            for(j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped == false)
                break;
        }
        
        return arr[k-1];
    } 
}
