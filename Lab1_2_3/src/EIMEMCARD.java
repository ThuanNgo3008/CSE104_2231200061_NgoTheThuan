// import java.util.Scanner;

// class EIMEMCARD {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         StringBuilder sb = new StringBuilder();
//         int soTestCase = sc.nextInt();
//         long[] arr = new long[soTestCase];

//         long[] gioiHan = { 1000000, 20000000, 50000000, 200000000, Long.MAX_VALUE };
//         double[] giamGia = { 0, 0.02, 0.03, 0.05, 0.07 };

//         long truoc = 0;
//         double tinh = 0;
//         for (int i = 0; i < soTestCase; i++) {
//             arr[i] = sc.nextLong();

//             for (int j = 0; j < gioiHan.length; j++) {
//                 if (truoc < gioiHan[j]) {
//                     tinh = arr[i] * giamGia[j];
//                     sb.append(tinh).append(" ");
//                     truoc += arr[i];
//                     break;
//                 }
//             }
//         }
//         System.out.println(sb);
//     }

// }

