public class Solution {

    public static int getLargestPrime(int number) {

        if (number <= 1)
            return -1;

        int lp = -1;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                int count = 0;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    lp = i;
                }
            }
        }

        return lp;
    }
}