import java.util.Scanner;

public class EIDINRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTestCase = sc.nextInt();
        for (int i = 0; i < soTestCase; i++) {
            double N = sc.nextDouble();
            double L = sc.nextDouble();
            double M = sc.nextDouble();
            int dem = 0;
            while(N < M) {
                N = N + (N * L/100);
                dem++;
            }
            System.out.println(dem);
        }
    }
}
