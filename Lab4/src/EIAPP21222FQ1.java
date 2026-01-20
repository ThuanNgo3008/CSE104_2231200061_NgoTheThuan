import java.util.Scanner;

public class EIAPP21222FQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tien = sc.nextDouble();
        double thang = sc.nextDouble();
        double[]soThang = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        double[]giam = {0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664, 0.0692};
        double tinh =0;
        if (thang <= 12) {
            for (int i = 0; i < soThang.length; i++) {
                if (thang == soThang[i]) {
                    tinh += tien + (tien*giam[i]*thang)/12;
                }
            }
        } else {
            while (thang > 0) {
                double sThang = Math.min(12, thang);
                for (int i = 0; i < soThang.length; i++) {
                    if (sThang == soThang[i]) {
                        tien = tien + (tien*giam[i]*sThang)/12;
                    }
                }
                thang -= 12;
            }
            tinh += tien;
        }
        System.out.println(Math.round(tinh));
    }
}
