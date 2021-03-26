package repetitive;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        //Se dau n numere naturale. Să se determine ultimul număr par dintre cele date.
        Scanner scan = new Scanner(System.in);
        System.out.println("Cate numere?");
        int x = scan.nextInt();
        System.out.print("Dai " + x + " numere : ");
        int y = scan.nextInt();
        int numarPar = 0;
        for (int i = 0; i <= y; i++) {
            if (y % 2 == 1)
                y = scan.nextInt();
            else
                numarPar = y;
        }
        System.out.println("Ultimul numar par este " + numarPar);
    }
}
