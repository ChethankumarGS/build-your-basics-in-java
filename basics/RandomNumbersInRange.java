import java.util.Random;

public class RandomNumbersInRange {
    public static void main(String[] args) {
        int min = 1, max = 100, count = 5;
        Random random = new Random();
        System.out.print(count + " random numbers between " + min + " and " + max + ": ");
        for (int i = 0; i < count; i++) {
            System.out.print((random.nextInt(max - min + 1) + min) + " ");
        }
        System.out.println();
    }
}
