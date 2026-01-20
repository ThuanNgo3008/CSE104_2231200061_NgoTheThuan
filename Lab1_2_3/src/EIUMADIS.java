import java.util.Scanner;

public class EIUMADIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doDaiMang = sc.nextInt();
        long[]arr = new long[(int)doDaiMang];
        for (int i = 0; i < doDaiMang; i++) {
            arr[i] = sc.nextLong();
        }

        long phanTuNhoNhat = arr[0];
        long max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < phanTuNhoNhat) {
                phanTuNhoNhat = arr[i];
            }

            long hieu = arr[i] - phanTuNhoNhat;
            if (hieu > max) {
                max = hieu;
            }
        }
        System.out.println(max);

    }
}

