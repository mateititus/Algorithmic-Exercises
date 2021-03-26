package ianuarie20repetitive;

import java.util.Scanner;

public class numerePanaLaZeroMaximulLor {
    public static void main(String[] args) {
        // Se citesc numere de la tastatură până la apariția lui zero. Să se determine maximul lor
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai numere pana la aparitia lui 0");
        int x = scan.nextInt();
        int celMaiMare = 0;
        while (x != 0) {
            x = scan.nextInt();
            if (x > celMaiMare) {
                celMaiMare = x;
            }
        }

        System.out.println(celMaiMare);
    }
}
