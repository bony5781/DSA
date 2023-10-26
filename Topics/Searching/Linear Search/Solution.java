class Solution {

    public static int findElement(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 0, -5, 7, 4 };
        int res = findElement(arr, -5);
        if (res >= 0) {
            System.out.print("Element found at " + res + " index");
        } else {
            System.out.println("Element not found");
        }

    }
}