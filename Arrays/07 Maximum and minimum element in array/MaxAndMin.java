//Space Complexity = O(1)
//Time Complexity = O(n)

public class MaxAndMin {

    public static int[] findThem(int arr[], int n) {

        // Initialize smallest element as Largest integer value in java
        int smallest = Integer.MAX_VALUE;
        // Initialize largest element as smallest integer value in java
        int largest = Integer.MIN_VALUE;
        int i = 0;
        int finalResult[] = new int[2];

        if (n == 1) {
            finalResult[0] = arr[0];
            finalResult[1] = arr[0];
            return finalResult;
        }

        /*
         * Linear search method, check individual elements if it is
         * lower than the current smallest or larger than the current
         * largest
         */
        while (i < n) {

            if (arr[i] < smallest) {
                smallest = arr[i];
            }

            if (arr[i] > largest) {
                largest = arr[i];
            }

            i++;
        }

        finalResult[0] = smallest;
        finalResult[1] = largest;

        return finalResult;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 54 };
        int[] display = findThem(arr, 4);
        System.out.println("Smallest element is = " + display[0] + " and largest is = " + display[1]);
    }

}