package cifreleUnuiNumar;

import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        // 36. Se citesc două numere naturale n și m.
        // Să se decidă dacă cele două numere au cel puțin o cifră comuna
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera un numar");
        int n = scan.nextInt();
        System.out.println("Ofera un numar");
        int m = scan.nextInt();
        int count = 0;
        while (n != 0 && m != 0) {
            for (int i = m; i<=n; i++) {
                if (n % 10 == m % 10) {
                    count++;
                }
            }
            for (int j = n; j<=m; j++) {
                if (m % 10 == n % 10) {
                    count++;
                }
            }
            n /= 10;
            m /= 10;
        }
        if (count != 0) {
            System.out.println("Numerele au " + count + " cifre in comun");
        } else
            System.out.println("Numerele nu au nici o cifra in comun");
    }
}
