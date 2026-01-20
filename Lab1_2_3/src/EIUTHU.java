import java.util.Scanner;

public class EIUTHU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();

        int i = 1;
        int dem = 0;
        while (i <= Math.min(input1.length(), input2.length())) {
            if (input1.substring(input1.length() - i).compareTo(input2.substring(0,i)) == 0) {
                dem = i;
            }
            i++;
        }
        System.out.println(input1.length() + input2.length() - dem);

    }
    
}

