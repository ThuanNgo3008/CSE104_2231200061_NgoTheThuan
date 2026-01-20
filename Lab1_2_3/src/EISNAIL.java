// import java.util.Scanner;

// public class EISNAIL {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long A = sc.nextLong();
//         long B = sc.nextLong();
//         long V = sc.nextLong();

//         long tu = V - A;
//         long mau = A - B;
//         long chia = (long) Math.ceil((double) tu/mau);
//         long soNgay = chia + 1;
//         System.out.println(soNgay);
//     }
// }

import java.util.Scanner;

public class EISNAIL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long V = sc.nextLong();

        long tu = V - A;
        long mau = A - B;
        long tinh = (long)Math.ceil((double) tu/mau);
        long ngay = tinh + 1;
        System.out.println(ngay);
    }
}