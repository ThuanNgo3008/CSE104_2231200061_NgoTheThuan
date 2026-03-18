import java.text.DecimalFormat;
import java.util.Scanner;

public class EIUCARLOAN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double New_P = sc.nextDouble();
        double m = sc.nextDouble() / 100;
        int n = sc.nextInt();
        int k = sc.nextInt();
        double L = sc.nextDouble() / 100;

        double X = P - (P * m);
        double deb0 = (P * 0.9 * Math.pow(1 - L, k - 1)) - (New_P * m);
        double low = 0;
        double high = 0.2;
        for (int i = 0; i < 100; i++) {
            double mid = (low + high)/2;
            double r = 1 + mid;
            double G = (X * Math.pow(r, n) * (r - 1))/(Math.pow(r, n) - 1);
            double deb1 = X * Math.pow(r, k - 1) - ((G * (Math.pow(r, k - 1) - 1))/mid);
            if (deb1 > deb0) {
                high = mid;
            } else {
                low = mid;
            }
        }
        System.out.printf("%.4f",low * 12);
    }
}
