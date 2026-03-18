import java.util.Scanner;

public class EIURETIRE2 {

    public static boolean check(double x0, double[] arr, int N, double r, double f) {
        double save = 0;
        double X = x0;
        for (int i = 0; i < N; i++) {
            save += arr[i] - X;
            save = save * (1 + r);
            X = X * (1 + f);
            if (save < -1e18) {
                return false;
            }
        }
        for (int i = N; i < 1200; i++) {
            save -= X;
            save = save * (1 + r);
            X = X * (1 + f);
            if (save < 0) {
                return false;
            }
        }
        return save >= 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doDaiMang = sc.nextInt();
        double r = sc.nextDouble() / 100 / 12;
        double f = sc.nextDouble() / 100 / 12;
        double[]arr = new double[doDaiMang];
        for (int i = 0; i < doDaiMang; i++) {
            arr[i] = sc.nextDouble();
        }

        double low = 0;
        double high = 1e12;
        for (int i = 0; i < 100; i++) {
            double mid = (low + high)/2;
            if (check(mid, arr, doDaiMang, r, f)) {
                low = mid;
            } else {
                high = mid;
            }
        }
        System.out.println((long) Math.floor(low));
    }

}
