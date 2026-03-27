import java.util.Scanner;

public class EIAPP24252FQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double New_P = sc.nextDouble();
        double m = sc.nextDouble() / 100;
        int n = sc.nextInt();
        double R = sc.nextDouble() / 100;
        double L = sc.nextDouble() / 100;

        double X = P - (P * m);
        double dow = New_P * m;
        double r = R / 12;
        double G;
        if (r == 0) {
            G = X / n;
        } else {
            G = (X * Math.pow(1 + r, n) * r) / (Math.pow(1 + r, n) - 1);
        }

        for (int k = 0; k <= n; k++) {
            double deb0 = P * 0.9 * Math.pow(1 - L, k);
            double deb1;
            if (r == 0) {
                deb1 = X - G * k;
            } else {
                deb1 = X * Math.pow(1 + r, k) - (G * ((Math.pow(1 + r, k) - 1) / r));
            }

            if (deb0 - deb1 >= dow) {
                System.out.println(k + " 0");
                return;
            }
        }
        double deb0 = P * 0.9 * Math.pow(1 - L, n);
        double deb1;
        if (r == 0) {
            deb1 = 0;
        } else {
            deb1 = X * Math.pow(1 + r, n) - (G * ((Math.pow(1 + r, n) - 1) / r));
        }
        double thieu = dow - (deb0 - deb1);
        if (thieu < 0) thieu = 0;
        System.out.printf("%d %.0f\n", n, thieu);

    }
}
