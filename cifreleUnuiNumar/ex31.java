package cifreleUnuiNumar;

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        // 31. Se citesc numere naturale până când se introduce numărul 0.
        // Afișați suma obținută prin adunarea numerelor formate din primele două cifre ale numerelor citite
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numere si incheiati cu 0");
        int x = scan.nextInt();
        int suma = 0;
        int primul = 0;
        int aldoilea = 0;
        while (x != 0){
            int numar = x;
            while (numar > 9) {
                primul = numar / 10;
                aldoilea = numar % 10;
                numar /= 10;
            }
            suma += primul + aldoilea;
            x = scan.nextInt();
        }
        System.out.println(suma);
    }
}
