
import java.util.Scanner;

public class UserInput2DArray {

    public static void main(String[] args) {
        int[][] data = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Enter a number for position (" + i + ", " + j + "): ");
                data[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nYou entered the following values:");
        for (int[] row : data) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();  
        }
    }
}