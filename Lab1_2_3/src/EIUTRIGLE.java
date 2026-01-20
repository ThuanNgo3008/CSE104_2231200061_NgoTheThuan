import java.util.Arrays;
import java.util.Scanner;

public class EIUTRIGLE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int doDaiMang = sc.nextInt();
        int[] arr = new int[doDaiMang];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        int dem = 0;
        for (int m = 0; m < arr.length - 2; m++) {
            for (int n = m+1; n < arr.length - 1; n++) {
                for (int k = n+1; k < arr.length; k++) {
                    if (arr[m] + arr[n] > arr[k]) {
                        dem++;
                    }
                }
            }
        }
        System.out.println(dem);
    }
}