import java.util.Scanner;

public class EIBANKLOAN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        int N = sc.nextInt();
        double r = sc.nextDouble() / 1200;
        double f = sc.nextDouble() / 100 + 1;
        double stat = X / N;
        double total = X;
        double sum = 0;
        double loan = 0;
        double pay = 0;
        double out = 0;
        double payout = 0;
        for (int i = 1; total > 0; i++) {
            loan = total * r;
            sum += pay + payout;
            pay = Math.max(stat*i - sum, 0);
            out = Y - loan - pay;
            payout = out / f;
            total = total - pay - payout;
            if (total > 0) {
                System.out.println(i + " " + Math.round(total));
            } else {
                System.out.println(i + " " + 0);
            }
        }
    }
}
