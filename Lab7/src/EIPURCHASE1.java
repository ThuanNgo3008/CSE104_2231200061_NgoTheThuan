import java.util.Scanner;

public class EIPURCHASE1 {
    public static double check(double tienNoDau, int thangConLai, double tienTraMoiThang, double lai) {
        for (int i = 0; i < thangConLai; i++) {
            tienNoDau = tienNoDau * (1 + lai) - tienTraMoiThang;
        }
        return tienNoDau;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double V = sc.nextDouble(); //tien goc
        int T = sc.nextInt(); //thang tra
        double N = sc.nextDouble(); //tien tra truoc
        double M = sc.nextDouble(); // tien tra moi thang

        double low = 0;
        double high = 1;
        double tienNoDau = V - N;
        for (int i = 0; i < 100; i++) {
            double lai = (low + high)/2;
            if (check(tienNoDau, T, M, lai) > 0) {
                high = lai;
            } else {
                low = lai;
            }
        }
        System.out.printf("%.3f\n",low);
    }
}
