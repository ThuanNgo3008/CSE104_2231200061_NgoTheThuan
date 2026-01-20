// import java.util.Scanner;

// public class EIBANKFEE {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder();
//         Scanner sc = new Scanner(System.in);
//         double tien = sc.nextDouble();
//         double soSec = sc.nextDouble();

//         double[] gioiHan = { 500, 2000, 5000, Double.MAX_VALUE };
//         double[] phiThang = { 12, 7.5, 5, 0 };
//         double[] phiSec = { 0.2, 0.2, 0.1, 0 };

//         double tong = 0;
//         for (int i = 0; i < gioiHan.length; i++) {
//             if (tien < gioiHan[i]) {
//                 tong = phiThang[i] + (soSec * phiSec[i]);
//                 sb.append(tong);
//                 break;
//             }
//         }
//         System.out.println(sb);
//     }
// }

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * EIBANKFEE
 */
public class EIBANKFEE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");
        
        int[]soDuTrungBinh = {500, 2000, 5000, Integer.MAX_VALUE};
        double[]phiThang = {12, 7.5, 5, 0};
        double[]phiSec = {0.2, 0.2, 0.1, 0};
        int soTestCase = sc.nextInt();

        int tongSec = 0;
        double tong = 0;
        for (int s = 0; s < soTestCase; s++) {
            double tien = sc.nextDouble();
            int sec = sc.nextInt();
            tongSec += sec;
            double tinh = 0;
            for (int i = 0; i < soDuTrungBinh.length; i++) {
                if (tien < soDuTrungBinh[i]) {
                    tinh = phiThang[i] + sec*phiSec[i];
                    tong += tinh;
                    break;
                }
            }

        }
        
        System.out.println(df.format(tong/tongSec));
    }
}