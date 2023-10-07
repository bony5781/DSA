// Time complexity : Average O(nlogn) Worst : O(n2)
//Space Complexity : O(1)

class QuickSort {

    public static int partition(int arr[], int low, int high) {
        int i = low - 1;
        int pivot = arr[high];

        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                //Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pvtidx = partition(arr, low, high);

            quickSort(arr, low, pvtidx - 1);
            quickSort(arr, pvtidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 1, 7, 9, 9 };
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}