// import java.util.Scanner;

// public class EIUMARKUP {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long so = sc.nextLong();
//         long tong = 0;
//         int i = 0;
//         while (so > 0) {
//             long sanPham = Math.min(so, 100);
//             long gia = 200 - i;
//             if (gia < 180) {
//                 gia = 180;
//             }
//             tong += sanPham * gia;
//             so -= 100;
//             i++;
//         }
//         System.out.println(tong);
//     }

// }

import java.util.Scanner;

/**
 * EIUMARKUP
 */
public class EIUMARKUP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so = sc.nextInt();
        int i = 0;
        int tong = 0;
        while (so > 0) {
            int sanPham = Math.min(so, 100);
            int gia = 200-i;
            if (gia < 180) {
                gia = 180;
            }
            tong += gia*sanPham;
            so -= 100;
            i++;
        }
        System.out.println(tong);
    }
}