import java.text.DecimalFormat;
import java.util.Scanner;

public class EIBANKLOAN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");
        long X = sc.nextLong();
        long Y = sc.nextLong();
        double r = sc.nextDouble() / 1200;

        double tu = Math.log(Y/(Y - X * r));
        double mau = Math.log(1 + r);
        double tinh = tu/mau;
        System.out.println(df.format(Math.ceil(tinh)));
    }
}
