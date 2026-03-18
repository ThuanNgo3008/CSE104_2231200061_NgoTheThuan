import java.util.Scanner;

public class EIUBHOUSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        int K = sc.nextInt();
        double X = sc.nextDouble() / 100;

        double noConLai = N - M;
        double tienTraMoiThang = noConLai / K;

        double tinh = 0;
        for (int i = 0; i < K; i++) {
            tinh = tienTraMoiThang + (noConLai - (tienTraMoiThang * i)) * X;
            System.out.println((i + 1) + " " + Math.round(tinh));
        }
    }

}
