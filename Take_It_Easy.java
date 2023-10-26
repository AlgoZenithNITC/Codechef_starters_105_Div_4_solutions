import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            func();
        }
        scanner.close();
    }

    public static void func() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            v.add(scanner.nextInt());
        }
        long sum = 0;
        for (int i : v) {
            sum += i;
        }
        boolean b = true;
        if (sum % n != 0) {
            b = false;
            System.out.println("No");
        }
        if (b) {
            long f = sum / n;
            int i = 0;
            for (i = 0; i < n; i++) {
                if (((Math.abs(f - v.get(i))) % 2) != 0) {
                    System.out.println("No");
                    break;
                }
            }
            if (i == n) {
                System.out.println("Yes");
            }
        }
        scanner.close();
    }
}
