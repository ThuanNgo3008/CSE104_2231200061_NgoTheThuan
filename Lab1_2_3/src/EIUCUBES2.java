// import java.util.Scanner;

// public class EIUCUBES2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long soTestCase = sc.nextLong();
//         for (long i = 0; i < soTestCase; i++) {
//             long phanTu = sc.nextLong();

//             long dem = (long)Math.cbrt(6*phanTu);
        
//             while (dem*(dem+1)*(dem+2)/6 > phanTu) {
//                 dem--;
//             }
//             System.out.println(dem + "");
//         }
//     }
// }

import java.util.Scanner;

public class EIUCUBES2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long soTestCase = sc.nextLong();
        for (int i = 0; i < soTestCase; i++) {
            long phanTu = sc.nextLong();

            long tinh = (long) Math.cbrt(6*phanTu);
            while (tinh*(tinh+1)*(tinh + 2)/6 > phanTu) {
                tinh--;
            }
            System.out.print(tinh + " ");
        }
    }
}