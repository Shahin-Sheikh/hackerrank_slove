import java.util.*;

public class javaloops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q, a, b, n;
        q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            int res = a;
            for (int j = 0; j < n; j++) {
                res += (int) (Math.pow(2, j) * b);
                System.out.print(Integer.toString(res) + ' ');
            }
            System.out.print('\n');
        }
    }
}
