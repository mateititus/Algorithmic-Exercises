package repetitive;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        // Se citesc numere de la tastatură până la apariția lui zero. Să se determine câte dintre ele erau impare.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numere si incheiati cu 0");
        int x = scan.nextInt();
        int nrImpare = 0;

        while (x != 0) {
            if (x % 2 == 1)
                nrImpare++;
            x = scan.nextInt();
        }

        System.out.println(nrImpare);

    }
}
