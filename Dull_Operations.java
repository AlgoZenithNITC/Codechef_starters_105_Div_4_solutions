import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(n + " " + (n - 1));
        }
        scanner.close();
    }
}
