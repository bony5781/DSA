import java.util.ArrayList;
import java.util.Collections;

class Solution {

    ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        for (int i = 2; i <= N; i++) {
            multiply(arr, i);
        }
        Collections.reverse(arr);
        return arr;
    }

    void multiply(ArrayList<Integer> arr, int n) {
        int carry = 0;
        for (int i = 0; i < arr.size(); i++) {
            int p = arr.get(i) * n + carry;
            arr.set(i, p % 10);
            carry = p / 10;
        }
        while (carry != 0) {
            arr.add(carry % 10);
            carry /= 10;
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.factorial(6));
    }
}
