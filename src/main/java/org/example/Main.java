import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = random.ints(10, 1, 101).toArray();

        System.out.println("Array Elements:");
        Arrays.stream(array).forEach(x -> System.out.print(x + " "));
        System.out.println();

        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
