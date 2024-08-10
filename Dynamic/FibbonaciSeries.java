package Dynamic;

public class FibbonaciSeries {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] F = new int[n + 1];

        F[0] = 0;
        F[1] = 1;

        for (int i = 2; i <= n; i++) {
            F[i] = F[i - 1] + F[i - 2];
            System.out.println(F[i - 1] + " " + F[i - 2]);
        }
        System.out.println(F[n - 1]);
        return F[n - 1];
    }
}
