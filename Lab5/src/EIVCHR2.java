import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class EIVCHR2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        int doDaiMang = sc.nextInt();
        long[]arr = new long[doDaiMang];
        for (int i = 0; i < doDaiMang; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);
        double tong = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            tong += arr[i];
        }
        
        long limit = 50000;
        double discount = (double)30/100;
        double pay = arr[arr.length - 1]*discount;
        if (pay <= limit) {
            System.out.println(df.format(tong + (arr[arr.length - 1] - pay)));
        } else {
            System.out.println(df.format(tong + (arr[arr.length - 1] - limit)));
        }

        
    }
    
}
