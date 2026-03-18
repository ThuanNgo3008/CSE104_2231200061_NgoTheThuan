import java.util.Scanner;

public class EIUCREDIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTestCase = sc.nextInt();
        double lai = sc.nextDouble() / 30;
        int T = sc.nextInt();
        long[]luu = new long[T + 1];
        for (int i = 0; i < soTestCase; i++) {
            int ngay = sc.nextInt();
            luu[ngay] += sc.nextLong();
        }

        double no = 0;
        double tien = 0;
        for (int i = 1; i <= T; i++) {
            if (tien < 0) {
                no += tien;
            }
            tien += luu[i];
            if (i % 30 == 1) {
                tien += no * lai;
                no = 0;
            }
        }
        System.out.printf("%.2f",tien);
    }
}
