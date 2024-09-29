import java.util.Arrays;
import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("So phan tu mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Sort Array: " + Arrays.toString(array));

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
