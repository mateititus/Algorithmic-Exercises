package cifreleUnuiNumar;

import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        // 35. Se citește un număr natural n.
        // Să se determine suma cifrelor aflate pe poziții impare.
        //Numărarea pozițiilor în numărul dat se face începând de la prima cifră.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera un numar");
        int n = scan.nextInt();
        int numar;
        int count = 0;
        int suma = 0;
        while (n != 0) {
            numar = n % 10;
            count++;
            if (count % 2 == 1) {
                suma += numar;
            }
            n /= 10;
        }
        System.out.println(suma);
    }
}
