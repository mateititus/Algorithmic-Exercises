package cifreleUnuiNumar;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        // 23. Se dau n numere naturale.
        // Să se afle pentru câte dintre numere, suma cifrelor împărţită la 9 dă restul r
        Scanner scan = new Scanner(System.in);
        System.out.println("Cate numere?");
        int x = scan.nextInt();
        System.out.println("Da-mi restul");
        int rest = scan.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= x; i++) {
            System.out.println("Introdu numarul " + i);
            int n = scan.nextInt();
            while (n != 0) {
                sum = sum + n % 10;
                if (sum % 9 == rest) {
                    count++;
                }
                n /= 10;
            }
        }
        System.out.println(count + " din numerele date care se impart la 9 dau restul " + rest);
    }
}
