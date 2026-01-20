// import java.util.Scanner;

// public class EIEVERYN {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int soTestCase = sc.nextInt();
//         for (int i = 0; i < soTestCase; i++) {
//             int doDaiMang = sc.nextInt();
//             int giaTri = sc.nextInt();

//             boolean[] check = new boolean[giaTri + 1];
//             for (int j = 0; j < doDaiMang; j++) {
//                 int num = sc.nextInt();
//                 if (num >= 1 && num <= giaTri) {
//                     check[num] = true;
//                 }
//             }
//             boolean flag = true;
//             for (int j = 1; j <= giaTri; j++) {
//                 if (check[j] == false) flag = false;
//             }
//             if (flag) {
//                 System.out.println("Yes");
//             } else {
//                 System.out.println("No");
//             }

//         }
//     }
// }

import java.util.Scanner;

public class EIEVERYN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTestCase = sc.nextInt();
        for (int i = 0; i < soTestCase; i++) {
            int doDaiMang = sc.nextInt();
            int khoangGiaTri = sc.nextInt();
            boolean[] check = new boolean[khoangGiaTri + 1];

            for (int j = 0; j < doDaiMang; j++) {
                int phanTu = sc.nextInt();
                if (phanTu >= 1 && phanTu <= khoangGiaTri) {
                    check[phanTu] = true;
                }
            }

            boolean khongPhatHien = true;
            for (int j = 1; j <= khoangGiaTri; j++) {
                if (check[j] == false) khongPhatHien = false;
            }
            

            if (khongPhatHien) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

