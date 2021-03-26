package cifreleUnuiNumar;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        //26. Se dă un număr natural n, apoi n numere naturale.
        // Să se calculeze suma obținută prin adunarea primei cifre a celor n numere citite
        Scanner scan = new Scanner(System.in);
        System.out.println("Cate numere?");
        int x = scan.nextInt();
        int suma = 0, primul = 0;
        for (int i = 1; i <= x; i++) {
            System.out.println("Introdu numarul " + i);
            int n = scan.nextInt();
            while (n > 9) {
                primul = n / 10;
                n /= 10;
            }
            suma += primul;
        }
        System.out.println(suma);
    }
}
