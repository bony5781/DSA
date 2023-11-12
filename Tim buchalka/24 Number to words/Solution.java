public class Solution {
    // write code here
    public static int getDigitCount(int number) {
        if (number == 0)
            return 1;
        if (number < 0)
            return -1;

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    public static int Reverse(int number) {

        int temp = (number > 0) ? number : -number;
        int rev = 0;

        while (temp > 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }

        if (number > 0) {
            return rev;
        } else {
            return -rev;
        }
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.print("Invalid Value");
            return;
        }
        if (number == 0) {
            System.out.print("Zero ");
            return;
        }

        int count = getDigitCount(number);
        number = Reverse(number);

        int thisCount = 0;
        while (number > 0) {
            int digit = number % 10;
            switch (digit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("Invalid Value");
            }
            thisCount++;
            number /= 10;
        }

        while (thisCount < count) {
            System.out.print("Zero ");
            thisCount++;
        }
    }

    public static void main(String[] args) {
        numberToWords(100);
    }
}