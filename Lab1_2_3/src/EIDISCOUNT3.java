import java.util.Scanner;

public class EIDISCOUNT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tien = sc.nextLong();
        int doDaiMang = 3;
        long[] gioiHan = { 5000000, 20000000, 100000000, 300000000, 600000000, 900000000 };
        double[] giamTheoGioiHan = { 0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };

        long truoc = 0;
        double tong = 0.0;
        for (int i = 0; i < gioiHan.length; i++) {
            if (tien > gioiHan[i]) {
                long hienTai = gioiHan[i] - truoc;
                tong += hienTai * giamTheoGioiHan[i];
                truoc = gioiHan[i];
            } else {
                long conLai = tien - truoc;
                tong += conLai * giamTheoGioiHan[i];
                break;
            }
        }
        if (tien > 900000000) {
            tong += (tien - 900000000) * 0.15;
        }
        long tienDaGiam = Math.round(tien - tong);

        for (int j = 0; j < doDaiMang; j++) {
            int phanTu = sc.nextInt();

            if (phanTu == 1) {
                tienDaGiam *= (1 - 0.02);
            } else {
                tienDaGiam *= 1;
            }
        }
        System.out.println(tienDaGiam);
    }
}
