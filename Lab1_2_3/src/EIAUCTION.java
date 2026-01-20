// import java.util.Scanner;

// public class EIAUCTION {
//     static Scanner sc = new Scanner(System.in);
//     static StringBuilder sb = new StringBuilder();

//     public static int[] input() {
//         int doDaiMang = sc.nextInt();
//         int[] arr = new int[doDaiMang];
//         for (int i = 0; i < doDaiMang; i++) {
//             arr[i] = sc.nextInt();
//         }
//         return arr;
//     }

//     public static void output(int[] arr) {
//         for (int e : arr) {
//             System.out.println(e + " ");
//         }
//         System.out.println();
//     }

//     public static int demx(int[] arr, int x) {
//         int dem = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == x) {
//                 dem++;
//             }
//         }
//         return dem;
//     }

//     public static void lap(int[] arr) {
//         int viTriMax = -1;
//         int soMax = -1;

//         for (int i = 0; i < arr.length; i++) {
//             int dem = demx(arr, arr[i]);

//             if (dem == 1) {
//                 if (arr[i] > soMax) {
//                     soMax = arr[i];
//                     viTriMax = i + 1;
//                 }
//             }
//         }
//         if (soMax == -1) {
//             System.out.println("none");
//         } else {
//             System.out.println(viTriMax);
//         }
//     }

//     public static void main(String[] args) {
//         int doDaiMang = sc.nextInt();
//         int[] arr = new int[doDaiMang];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         lap(arr);

//     }
// }

import java.util.Scanner;

/**
 * EIAUCTION
 */
public class EIAUCTION {

    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int doDaiMang = sc.nextInt();
        int[]arr = new int[doDaiMang];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void output(int[]arr) {
        for (int e : arr) {
            System.out.println(e + " ");
        }
        System.out.println();
    }

    public static int demx(int[]arr, int x) {
        int dem = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == x) {
                dem++;
            }
        }
        return dem;
    }

    public static void lap(int[]arr) {
        int soLonNhat = -1;
        int viTriLonNhat = -1;
        for (int i = 0; i < arr.length; i++) {
            if (demx(arr, arr[i]) == 1) {
                if (arr[i] > soLonNhat) {
                    soLonNhat = arr[i];
                    viTriLonNhat = i + 1;
                }
            }
        }
        if (soLonNhat == -1) {
            System.out.println("none");
        } else {
            System.out.println(viTriLonNhat);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doDaiMang = sc.nextInt();
        int[]arr = new int[doDaiMang];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        lap(arr);
    }
}