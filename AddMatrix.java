import java.util.Scanner;

public class AddMatrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();

        int[][] maTran1 = new int[rows][cols];
        int[][] maTran2 = new int[rows][cols];

        System.out.println("Nhập các phần tử của ma trận thứ nhất:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maTran1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập các phần tử của ma trận thứ hai:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maTran2[i][j] = scanner.nextInt();
            }
        }

        int[][] tongMaTran = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tongMaTran[i][j] = maTran1[i][j] + maTran2[i][j];
            }
        }

        System.out.println("Tổng của hai ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(tongMaTran[i][j] + " ");
            }
            System.out.println();
        }
    }
}
