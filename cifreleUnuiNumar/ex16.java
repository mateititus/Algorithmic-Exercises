package cifreleUnuiNumar;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        // 16. Se dă un număr natural format din cifrele 2 sau 3.
        // Aflaţi cifra care apare de cele mai multe ori în scrierea numărului .
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera numar");
        int n = scan.nextInt();
        int numarTrei = 0;
        int numarDoi = 0;
        while (n != 0) {
            if (n % 10 == 2) {
                numarDoi++;
            }
            if (n % 10 == 3) {
                numarTrei++;
            }
            n /= 10;
        }
        if (numarDoi > numarTrei) {
            System.out.println("Numarul 2 apare de mai multe ori, apare de " + numarDoi + " ori");
        } else
            System.out.println("Numarul 3 apare de mai multe ori, apare de " + numarTrei + " ori");
    }
}

