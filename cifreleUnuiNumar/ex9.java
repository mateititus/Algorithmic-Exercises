package cifreleUnuiNumar;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        // Scrieți un program care citește un număr natural n și o cifră k.
        // Programul va calcula produsul P al cifrelor lui n diferite de cifra k
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai numar");
        int n = scan.nextInt();
        System.out.println("Da-mi o singura cifra");
        int k = scan.nextInt();
        int produs = 1;
        while (n != 0) {
            if (n % 10 != k) {
                produs = produs * (n % 10);
            }
            n = n / 10;
        }
        System.out.println(produs);
    }
}
