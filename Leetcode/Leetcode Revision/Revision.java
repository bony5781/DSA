import java.util.Random;

public class Revision {

    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static void main(String[] args) {
        int array[] = { 2, 3, 118 };
        System.out.println(getRandom(array));
    }
}