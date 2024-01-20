import java.util.ArrayList;
import java.util.Collections;

class Solution {

    public ArrayList<Integer> factorial(int N){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int temp = 1, counter = 0, carry = 0;
        arr.add(1);
        for(int i = 2; i <= N; i++){
            temp = temp * i;
            if(temp >= 0 && temp <= 9){
                arr.set(counter, temp);
            }else{
                arr.set(counter,temp%10);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.factorial(5));
    }
}