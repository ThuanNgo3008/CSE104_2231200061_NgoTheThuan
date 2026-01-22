import java.util.Scanner;

public class EIBANKRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        int M = sc.nextInt();
        double lai = (double) 9 / 100;
        double tinh = N + (N*lai*M)/12;
        System.out.println(tinh);
    }
}
