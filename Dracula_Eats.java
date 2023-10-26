import java.util.Scanner;

public class Main {
    public static void func() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans;
        if ((n - 1) % 7 == 0) {
            ans = (n - 1) / 7;
        } else {
            ans = (n - 1) / 7 + 1;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            func();
        }
    }
}
