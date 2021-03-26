package ianuarie20repetitive;

import java.util.Scanner;

public class CelMaiMarenNumere {
    public static void main(String[] args) {
        // se dau n numere intregi, calculeaza cel mai mare dintre numerele date
        Scanner scan = new Scanner(System.in);
        System.out.println("Cate numere? ");
        int n = scan.nextInt();
        System.out.println("Dai " + n + " numere");
        int celMaiMare = scan.nextInt();
        for (int i = 1; i < n; i++) {
            int x = scan.nextInt();
            if (x > celMaiMare) {
                celMaiMare = x;
            }
        }
        System.out.println(celMaiMare);
    }
}
