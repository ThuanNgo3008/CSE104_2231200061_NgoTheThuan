import java.util.Scanner;

public class EIPOINT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int diem = sc.nextInt();
    
        // if (diem >= 90) {
        //     System.out.println("A");
        // }
        // else if (diem >= 85) {
        //     System.out.println("A-");
        // }
        // else if (diem >= 80) {
        //     System.out.println("B+");
        // }
        // else if (diem >= 75) {
        //     System.out.println("B");
        // }
        // else if (diem >= 70) {
        //     System.out.println("B-");
        // }
        // else if (diem >= 65) {
        //     System.out.println("C+");
        // }
        // else if (diem >= 60) {
        //     System.out.println("C");
        // }
        // else if (diem >= 55) {
        //     System.out.println("C-");
        // }
        // else if (diem >= 53) {
        //     System.out.println("D+");
        // }
        // else if (diem >= 52) {
        //     System.out.println("D");
        // }
        // else if (diem >= 50) {
        //     System.out.println("D-");
        // }
        // else if (diem >= 0) {
        //     System.out.println("F");
        // }

        int[] diemSo = {90 ,85 ,80 ,75 ,70 ,65 ,60 ,55 ,53 ,52 ,50 ,0};
        String[] diemChu = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"};

        for (int i = 0; i < diemSo.length; i++) {
            if (diem >= diemSo[i]) {
                System.out.println(diemChu[i]);
                break;
            }
        }
    }
}

