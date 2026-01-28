import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class EIVCHR3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int doDaiMang = sc.nextInt();
        int soVoucher = sc.nextInt();
        long[]arr = new long[doDaiMang];
        for (int i = 0; i < doDaiMang; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        double tong = 0;
        for (int i = 0; i < arr.length - soVoucher; i++) {
            tong += arr[i];
        }

        long limit = 50000;
        double discount = (double)30/100;
        for (int i = arr.length - 1; i >= Math.max(arr.length - soVoucher, 0); i--) {
            if (arr[i] * discount <= limit) {
                tong += arr[i] - (arr[i] * discount);
            } else {
                tong += arr[i] - limit;
            }
        }
        System.out.println(df.format(tong));

    }
}
