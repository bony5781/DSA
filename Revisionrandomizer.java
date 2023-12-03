import java.util.Random;

public class Revisionrandomizer {

    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static void main(String[] args) {
        int array[] = { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 2, 56, 57, 58, 59, 60, 61, 62, 63,
                64, 65, 44, 45 };
        System.out.println(getRandom(array));
    }
}