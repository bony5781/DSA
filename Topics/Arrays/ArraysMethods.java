import java.util.Arrays;

class ArraysMethods {

    private final double[][] data;
    private final int empLower, yearLower;
    
    public ArraysMethods(int empLower, int empUpper, int yearLower, int yearUpper) {
        this.empLower = empLower;
        this.yearLower = yearLower;
        int numRows = empUpper - empLower + 1;
        int numCols = yearUpper - yearLower + 1;
        data = new double[numRows][numCols];
    }

    // Linear Search
    public boolean linearSearch(int arr[], int target) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // Find minimum
    public int findMinimum(int arr[]) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum)
                minimum = arr[i];
        }
        return minimum;
    }

    // Find maximum
    public int findMaximum(int arr[]) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum)
                maximum = arr[i];
        }
        return maximum;
    }

    // Find average
    public int findAverage(int arr[]) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total / arr.length;
    }

    // Find median (Doesnt work for duplicates)
    public int findMedianNaive(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int smaller = 0;
            int larger = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i])
                    larger++;
                if (arr[j] < arr[i])
                    smaller++;
            }
            if (smaller == larger) {
                return arr[i]; // Only true when median has equal #s on both sides
            }
        }
        return -1;
    }

    // Find median
    public int findMedian(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array must not be empty");

        Arrays.sort(arr); // You need to import java.util.Arrays
        int n = arr.length;

        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2;
        }
    }
    
    //Insert and removing elements
    //Cant add or remove elements in java array as they are immutable. Use Array lists instead.

    //For non zero lower bounds
    //Employee id ranges from 1 to 1000 and dob starts from 1990
    public void set(int empId, int year, double value) {
        data[empId - empLower][year - yearLower] = value;
    }

    public double get(int empId, int year) {
        return data[empId - empLower][year - yearLower];
    }

    public void printAll() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%.2f ", data[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr1D[] = new int[]{ 1, 7, 4, 9, 11, -5, 104, 7};;
        ArraysMethods obj = new ArraysMethods(1, 10, 2000, 2010);
        obj.set(6, 2005, 74816.0);
        obj.set(3, 2001, 23500.5);
        boolean found = obj.linearSearch(arr1D, 4);
        System.out.println("Element found? : " + found);
        System.out.println("Minimum element : " + obj.findMinimum(arr1D));
        System.out.println("Maximum element : " + obj.findMaximum(arr1D));
        System.out.println("Average : " + obj.findAverage(arr1D));
        System.out.println("Median : " + obj.findMedianNaive(arr1D));
        System.out.println("Median : " + obj.findMedian(arr1D));
        System.out.println("In 2005, employee 6 made ₹" + obj.get(6, 2005));
        System.out.println("In 2001, employee 3 made ₹" + obj.get(3, 2001));
    }

}