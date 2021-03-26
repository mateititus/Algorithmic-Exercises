package cifreleUnuiNumar;

import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        // 34. Se dau n numere naturale.
        // Se construiește o valoare selectând de la fiecare număr cifra maximă.
        // Determinați pătratul acestei valori
        Scanner scan = new Scanner(System.in);
        System.out.println("Cate numere?");
        int x = scan.nextInt();
        int valoare = 0;
        int cifraMaxima = 0;
        for (int i = 1; i <= x; i++) {
            System.out.println("Introdu numarul " + i);
            int n = scan.nextInt();
            while (n != 0) {
                if (n % 10 > cifraMaxima) {
                    cifraMaxima = n % 10;
                }
                n /= 10;
            }
            valoare += cifraMaxima;
        }
        System.out.println(Math.sqrt(valoare));
    }
}
