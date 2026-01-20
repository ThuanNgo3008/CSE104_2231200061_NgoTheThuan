import java.util.Scanner;

public class EIBANKFEE2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int soTestCase = sc.nextInt();

        double[] gioiHan = { 500, 2000, 5000, Double.MAX_VALUE };
        double[] phiThang = { 12, 7.5, 5, 0 };
        double[] phiSec = { 0.2, 0.2, 0.1, 0 };

        double tongTien = 0;
        double tongSec = 0;

        for (int i = 0; i < soTestCase; i++) {
            double tien = sc.nextDouble();
            double soSec = sc.nextDouble();
            tongSec += soSec;

            double tinh = 0;
            for (int j = 0; j < gioiHan.length; j++) {
                if (tien < gioiHan[j]) {
                    tinh = phiThang[j] + (soSec * phiSec[j]);
                    tongTien += tinh;
                    break;
                }
            }

        }
        System.out.println(tongTien / tongSec);

    }
}
