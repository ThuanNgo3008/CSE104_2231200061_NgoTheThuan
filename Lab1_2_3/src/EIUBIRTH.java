
import java.util.Scanner;

public class EIUBIRTH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long soTestCase = sc.nextLong();
        for (int i = 0; i < soTestCase; i++) {
            Long xanh = sc.nextLong();
            Long ddo = sc.nextLong();
            Long giaXanh = sc.nextLong();
            Long giaDo = sc.nextLong();
            Long giaDoi = sc.nextLong();

            System.out.println(Math.min(giaXanh, giaDo + giaDoi)*xanh + Math.min(giaDo, giaXanh + giaDoi)*ddo);
        }
    }
}