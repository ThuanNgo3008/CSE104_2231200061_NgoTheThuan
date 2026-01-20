import java.util.Scanner;

public class EIINCRDES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doDaiMang = sc.nextInt();
        int[] arr = new int[doDaiMang];

        boolean tang = true;
        boolean giam = true;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                tang = false;
            }
            if (arr[i] >= arr[i - 1]) {
                giam = false;
            }
        }
        if (tang) {
            System.out.println("increasing");
        } else if (giam) {
            System.out.println("decreasing");
        } else {
            System.out.println("none");
        }
    }
}

