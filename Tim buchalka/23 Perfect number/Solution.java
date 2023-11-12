public class Solution {
    // write code here
    public static boolean isPerfectNumber(int number){
        
        if(number < -1) return false;
        if(number == 0) return false;
        if(number == 1) return true;
        
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0) {
                sum += i;
            }
        }
        if(sum == number) return true;
        return false;
    }
}