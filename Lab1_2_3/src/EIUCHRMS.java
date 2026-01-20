import java.util.Scanner;

public class EIUCHRMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doDaiMang = sc.nextInt();

        long[] gioiHan = { 2000000, 5000000, 10000000, 20000000, 50000000, 100000000, 200000000 };
        double[] giam = { 0.03, 0.04, 0.05, 0.06, 0.07, 0.08, 0.09, 0.1 };

        double tong = 0.0;
        for (int i = 0; i < doDaiMang; i++) {
            long phanTu = sc.nextLong();
            if (phanTu % 1000 != 0) {
                break;
            }

            for (int j = 0; j < gioiHan.length; j++) {
                if (phanTu <= gioiHan[j]) {
                    double tinh = phanTu * (1 - giam[j]);
                    tong += tinh;
                    break;
                }
            }

            if (phanTu > 200000000) {
                tong += phanTu * (1 - 0.1);
            }
        }
        System.out.println(Math.round(tong));

    }
}
