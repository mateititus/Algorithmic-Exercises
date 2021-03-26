package repetitive;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        // Se dau n numere naturale. Determinaţi primul număr par dintre cele n numere.
        Scanner scan = new Scanner(System.in);
        System.out.println("Cate numere?");
        int x = scan.nextInt();
        System.out.print("Dai " + x + " numere : ");
        int numarPar = -1;
        for (int i = 1; i <= x; i++) {
            int y = scan.nextInt();
            if (y % 2 == 0 && numarPar == -1) {
                numarPar = y;
            }
        }
        System.out.println("Primul numar par este " + numarPar);
    }
}
