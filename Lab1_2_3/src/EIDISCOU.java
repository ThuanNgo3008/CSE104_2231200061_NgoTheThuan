// import java.util.Scanner;

// public class EIDISCOU {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long tien = sc.nextLong();
//         long[] tienGioiHan = {2000000, 10000000, 50000000, 100000000, 200000000, 500000000};
//         double[] discount = {0.0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15};

//         double tong = 0.0;
//         long tienTruocDo = 0;
//         for (int i = 0; i < tienGioiHan.length; i++) {
//             if (tien > tienGioiHan[i]) {
//                 long tienHienTai = tienGioiHan[i] - tienTruocDo;
//                 tong += tienHienTai*discount[i];
//                 tienTruocDo = tienGioiHan[i];
//             } else {
//                 long tienConLai = tien - tienTruocDo;
//                 tong += tienConLai*discount[i];
//                 break;
//             }
//         }

//         if (tien > 500000000) {
//             tong += (tien-500000000)*0.15;
//         }
//         System.out.println((long)Math.round(tien-tong));
//     }
// }

import java.util.Scanner;

public class EIDISCOU {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tien = sc.nextLong();
        long[] tienGioiHan = {2000000, 10000000, 50000000, 100000000, 200000000, 500000000};
        double[] discount = {0.0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15};

        long tienTruoc = 0;
        double tong = 0.0;
        for (int i = 0; i < tienGioiHan.length; i++) {
            if (tien > tienGioiHan[i]) {
                long tienHienTai = tienGioiHan[i] - tienTruoc;
                tong += tienHienTai*discount[i];
                tienTruoc = tienGioiHan[i];
            } else {
                double tienConLai = tien - tienTruoc;
                tong += tienConLai*discount[i];
                break;
            }
            if (tien > 500000000) {
                tong += (tien-500000000)*0.15;
            }
        }
        System.out.println((long)Math.round(tien-tong));
    }
}