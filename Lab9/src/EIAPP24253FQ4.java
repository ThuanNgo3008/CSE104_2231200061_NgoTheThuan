import java.util.Scanner;

public class EIAPP24253FQ4 {
    static boolean check(double x0, int N, long P0, double c, double[]f, double[]r) {
        double save = 0;
        double X = P0;
        for (int t = 1; t <= N; t++) {
            int time = (t - 1) / 60;
            double ff = f[time];
            double rr = r[time];

            double s = save * (1 + rr) + x0;
            double x = 0.3 * X;

            if (s >= x) {
                double xs = X - s;
                int nt = N - t;

                if (nt == 0) return xs <= 0;
                if (xs <= 0) return true;

                double cnt = Math.pow(1 + c, nt);
                double cntt = xs * cnt - x0 * (cnt - 1) / c;
                return cntt <= 0;
            }
            save = s;
            X = X * (1 + ff);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long P0 = sc.nextLong();
        double c = sc.nextDouble();
        double[]f = new double[8];
        double[]r = new double[8];
        for (int i = 0; i < 8; i++) f[i] = sc.nextDouble();
        for (int i = 0; i < 8; i++) r[i] = sc.nextDouble();
        double low = 0;
        double high = 1e13;
        for (int i = 0; i < 200; i++) {
            double mid = (low + high) / 2;
            if (check(mid, N, P0, c, f, r)) {
                high = mid;
            } else {
                low = mid;
            }
        }
        System.out.println(Math.round(high));
    }
}
