import java.util.Scanner;

public class EIGROSS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tien = sc.nextLong();
        if (tien <= 11000000) {
            System.out.println(tien);
            return;
        }
        long[]gioiHan = {0, 4750000, 9250000, 16050000, 27250000, 42250000, 61850000};
        long[]thue = {0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000};
        double[]giam = {0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35};

        long luong = tien - 11000000;
        double tinh = 0;
        for (int i = gioiHan.length - 1; i >= 0; i--) {
            if (luong > gioiHan[i]) {
                long hieu = luong - gioiHan[i];
                tinh = thue[i] + (hieu/(1-giam[i])) + 11000000;
                break;
            }
        }
        System.out.println(Math.round(tinh));

    }
}
