import java.util.Scanner;

public class EIUBALANCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doDaiMang = sc.nextInt();
        long[]arr = new long[doDaiMang];
        for (int i = 0; i < doDaiMang; i++) {
            arr[i] = sc.nextLong();
        }
        double X = sc.nextDouble();
        double r = sc.nextDouble() / 100 / 12;
        double f = sc.nextDouble() / 100 / 12;

        double save = 0;
        for (int i = 0; i < doDaiMang; i++) {
            save += arr[i] - X;
            save = save * (1 + r);
            X = X * (1 + f);
        }
        for (int i = 0; i < doDaiMang; i++) {
            save -= X;
            save = save * (1 + r);
            X = X * (1 + f);
        }
        if (save < 0) save = 0;
        System.out.println(Math.round(save));
    }
}
