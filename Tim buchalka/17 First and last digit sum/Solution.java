public class FirstLastDigitSum {
    // write code here
    public static int sumFirstAndLastDigit(int number){
        if(number < 0) return -1;
        if(number / 10 == 0) return number*2;
        
        int sum = 0, temp = number;
        while(temp > 0){
            if(temp == number || temp / 10 == 0) sum += temp % 10;
            temp = temp / 10;
        }
        
        return sum;
    }
}