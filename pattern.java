import java.util.Scanner;

public class pattern {


    public static void main(String[] args) {
        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Pattern generation
        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += i;
            }
            System.out.println();
        }
    }
}
