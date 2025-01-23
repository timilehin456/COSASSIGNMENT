
public class Flag {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 4; j++) {
                System.out.print("=");
            }

            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}