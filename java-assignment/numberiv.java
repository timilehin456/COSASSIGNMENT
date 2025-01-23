
import java.util.Scanner;

public class UserInputArray {

    public static void main(String[] args) {
        int[] data = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter a number for index " + i + ": ");
            data[i] = scanner.nextInt();  
        }

        System.out.println("\nYou entered the following values:");
        for (int value : data) {
            System.out.println(value);
        }
    }
}