// import java.util.Scanner;

// public class EIDISCOUNT2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long tien = sc.nextLong();
//         long[] tienGioiHan = { 5000000, 20000000, 100000000, 300000000, 600000000, 900000000 };
//         double[] discount = { 0.0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };

//         double tong = 0.0;
//         long tienTruocDo = 0;
//         for (int i = 0; i < tienGioiHan.length; i++) {
//             if (tien > tienGioiHan[i]) {
//                 long tienHienTai = tienGioiHan[i] - tienTruocDo;
//                 tong += tienHienTai * discount[i];
//                 tienTruocDo = tienGioiHan[i];
//             } else {
//                 long tienConLai = tien - tienTruocDo;
//                 tong += tienConLai * discount[i];
//                 break;
//             }
//         }

//         if (tien > 900000000) {
//             tong += (tien - 900000000) * 0.15;
//         }
//         System.out.println((long) Math.round(tien - tong));
//     }
// }

import java.util.Scanner;

public class EIDISCOUNT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tien = sc.nextLong();
        long[] tienGioiHan = { 5000000, 20000000, 100000000, 300000000, 600000000, 900000000 };
        double[] discount = { 0.0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };

        double tong = 0.0;
        long tienTruocDo = 0;
        for (int i = 0; i < tienGioiHan.length; i++) {
            if (tien > tienGioiHan[i]) {
                long tienHienTai = tienGioiHan[i] - tienTruocDo;
                tong += tienHienTai * discount[i];
                tienTruocDo = tienGioiHan[i];
            } else {
                long tienConLai = tien - tienTruocDo;
                tong += tienConLai * discount[i];
                break;
            }
        }

        if (tien > 900000000) {
            tong += (tien - 900000000) * 0.15;
        }
        long ketQua = Math.round(tien - tong);
        for (int i = 1; i <= 3; i++) {
            int giamT = sc.nextInt();
            if (giamT == 1) {
                ketQua *= (1-0.02);
            }
            if (giamT == 0) {
                ketQua *= 1;
            }
        }
        System.out.println(ketQua);
    }
}
