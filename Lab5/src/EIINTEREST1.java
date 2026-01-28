import java.util.Scanner;

public class EIINTEREST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = sc.nextDouble();
        int testCase = 12;
        double total = 0;
        for (int i = 0; i < testCase; i++) {
            long money = sc.nextLong();

            total = total + money + ((total + money) * rate);
        }
        System.out.println(Math.round(total));
    }
    
}
