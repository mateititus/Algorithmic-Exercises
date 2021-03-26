package cifreleUnuiNumar;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        // 19. Se citeste n.
        // Afisati numarul, cu prima cifra inversata cu a 2-a, a 3-a cu a 4-a, etc
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera numar");
        int n = scan.nextInt();
        int invers = 0;
        int intors = 0;
        while (n != 0) {
            invers = invers * 10 + n % 10;
            n /= 10;
        }
        while (invers != 0) {
            intors = intors * 100 + invers % 100;
            invers /= 100;
        }
        System.out.println(intors);
    }
}
