// import java.util.Scanner;

// public class EIUSALES {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long doanhSo = sc.nextLong();
//         long[] gioiHan = { 20, 50, 200, 500, 2000 };
//         double[] thuong = { 0.02, 0.03, 0.04, 0.05, 0.06, 0.07 };

//         double tong = 0.0;
//         long truoc = 0;
//         for (int i = 0; i < gioiHan.length; i++) {
//             if (doanhSo > gioiHan[i]) {
//                 long hienTai = gioiHan[i] - truoc;
//                 tong += hienTai * thuong[i];
//                 truoc = gioiHan[i];
//             } else {
//                 long conLai = doanhSo - truoc;
//                 tong += conLai * thuong[i];
//                 break;
//             }
//         }
//         if (doanhSo > 2000) {
//             tong += (doanhSo - 2000) * 0.07;
//         }
//         System.out.printf("%.6f", tong);

//     }
// }

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * EIUSALES
 */
public class EIUSALES {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int so = sc.nextInt();
        int[]gioiHan = {20, 50, 200, 500, 2000, Integer.MAX_VALUE};
        double[]giam = {0.02, 0.03, 0.04, 0.05, 0.06, 0.07};

        int truoc = 0;
        double tong = 0;
        for (int i = 0; i < gioiHan.length; i++) {
            if (so > gioiHan[i]) {
                int hienTai = gioiHan[i] - truoc;
                tong += hienTai*giam[i];
                truoc = gioiHan[i];
            } else {
                int hienTai = so - truoc;
                tong += hienTai*giam[i];
                break;
            }
        }
        System.out.println(df.format(tong));
    }
}