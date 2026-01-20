import java.util.*;

public class EIMONE {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your money: ");
        int tien = sc.nextInt();
        int[] tienCoSan = { 20, 10, 5, 1 };
        int[] sotienThoiLai = new int[tienCoSan.length];

        for (int i = 0; i <= tienCoSan.length; i++) {
            if (tien == 0) {
                break;
            }
            if (tien >= tienCoSan[i]) {
                sotienThoiLai[i] = tien / tienCoSan[i];
                tien %= tienCoSan[i];

                System.out.println(tienCoSan[i] + " " + sotienThoiLai[i]);
            }
        }

    }
}
