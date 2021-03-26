package ianuarie20repetitive;

import java.util.Scanner;

public class nNumereIntregi {
    public static void main(String[] args) {
        // n numere intregi, care e cel mai mare numere din cele date
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai numere");
        int x = scan.nextInt();
        System.out.println("Dai " + x + " numere");
        int n = scan.nextInt(); // aici am citit primu numar
        int celMaiMare = n;
        for (int i = 1; i < x; i++) {
            n = scan.nextInt();
            if (n > celMaiMare) {
                celMaiMare = n;
            }
        }
        System.out.println(celMaiMare);
    }
}
