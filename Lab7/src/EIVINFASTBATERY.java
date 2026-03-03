import java.util.Scanner;

public class EIVINFASTBATERY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        int T = sc.nextInt();
        double r = (double)sc.nextDouble()/100;

        double tu = N - (M/(Math.pow(1 + r, T)));
        double mau = (1 - (Math.pow(1 + r, -T)))/r;
        System.out.println(Math.round(tu/mau));
    }
    
}
