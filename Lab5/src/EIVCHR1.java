import java.text.DecimalFormat;
import java.util.Scanner;

public class EIVCHR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        long money = sc.nextLong();
        if (money < 1000 || money % 1000 != 0) {
            return;
        }
        double discount = (double)30/100;
        long limit = 50000;
        double pay = money*discount;
        if (pay <= limit) {
            System.out.println(df.format(money - pay));
        } else {
            System.out.println(df.format(money - limit));
        }

    }
    
}
