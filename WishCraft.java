import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t--) {
            long n = scanner.nextLong();
            
            long p = scanner.nextLong();
            long q = scanner.nextLong();
            
            //int[] arr = new int[n];
            List<Long> arr = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextLong());
            }
            
            Collections.sort(arr);
            
            long res = arr.get((int) n - 1) - arr.get(0);
            long ops = p + q;
            
            if (p == 0 && q == 0) {
                System.out.println(res);
            } else {
                for (int i = 1; i < n - 1; i++) {
                    arr.set(i, Math.abs(arr.get(i)));
                }
                Collections.sort(arr.subList(1, (int) n - 1));
                
                for (int i = (int) n - 2; i > 0; i--) {
                    if (ops == 0) {
                        break;
                    } else {
                        res += arr.get(i);
                        ops--;
                    }
                }
                System.out.println(res);
            }
        }
        scanner.close();
    }
}
