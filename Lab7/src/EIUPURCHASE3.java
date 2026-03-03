import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

class EIUPURCHASE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double M = sc.nextDouble();
        int N = sc.nextInt();
        double R = sc.nextDouble();

        double tienConLai = P - M;
        double tinh = tienConLai * (R/(1 - Math.pow(1 + R, -N)));
        System.out.println((long) tinh);
    }
}
