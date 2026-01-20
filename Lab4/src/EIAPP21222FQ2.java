import java.util.Scanner;

public class EIAPP21222FQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] soThang = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        double[] giam = { 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,
                0.0692 };
        int soTestCase = sc.nextInt();
        int i = 0;
        double tong = 0;
        while (i < soTestCase) {
            double tien = sc.nextInt();
            double thang = soTestCase - i;
            if (thang <= 12) {
                for (int j = 0; j < soThang.length; j++) {
                    if (thang == soThang[j]) {
                        tong += tien + (tien * thang * giam[j]) / 12;
                    }

                }

            } else {
                while (thang > 0) {
                    double sThang = Math.min(thang, 12);
                    for (int j = 0; j < soThang.length; j++) {
                        if (sThang == soThang[j]) {
                            tien = tien + (tien * sThang * giam[j]) / 12;
                        }

                    }
                    thang -= 12;
                }
                tong += tien;
            }
            i++;
        }
        System.out.println(Math.round(tong));
    }
}
