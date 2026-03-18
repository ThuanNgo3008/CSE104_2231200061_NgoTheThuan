import java.text.DecimalFormat;
import java.util.Scanner;

public class EIAPP21222FQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");
        double[]lai = {0, 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92};
        long tien = sc.nextLong();
        int soThang = sc.nextInt();

        double tong = 0;
        for (int i = 1; i <= soThang; i++) {
            int thang = i % 12;
            int nam = i / 12;

            double tinh = Math.pow(1 + (lai[12]/100), nam);
            if (thang > 0) {
                tinh *= 1 + (lai[thang]/100) * thang / 12;
            }
            tong += tinh;
        }
        System.out.println(df.format(tien / tong));

    }
}
