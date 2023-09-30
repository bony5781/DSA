public class BubbleSort {

    public static int[] bubble(int[] arr, int n) {

        int i, j, temp;
        boolean isSwapped;
        for (i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }

            // If no two elements were
            // isSwapped by inner loop, then break
            if (isSwapped == false)
                break;
        }

        return arr;
    }

    public static void main(String[] args) {
        int i;
        int[] arr = new int[] { 1, 6, 3, 7, 2, 5, 5, 9, 63, 0, 7 };
        int n = arr.length;
        arr = bubble(arr, n);
        for (i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}