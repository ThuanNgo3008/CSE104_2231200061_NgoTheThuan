import java.text.DecimalFormat;
import java.util.Scanner;

public class EIGROSS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int soTestCase = sc.nextInt();
        for (int i = 0; i < soTestCase; i++) {
            double so = sc.nextDouble();
            double tu = so * 0.1;
            double mau = 1 - 0.1;
            double tinh = tu/mau;
            System.out.println(df.format(tinh));
        }
    }
}
