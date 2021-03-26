package cifreleUnuiNumar;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        //  Se citeşte de la tastatură un număr natural.
        //  Să se determine cea mai mare cifră care apare în scrierea acestuia şi numărul de apariţii ale ei
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai un numar");
        int n = scan.nextInt();
        int celMaiMare = 0;
        int count = 0;
        while (n != 0) {
            if (n % 10 > celMaiMare) {
                celMaiMare = n % 10;
            }
            if (celMaiMare == n % 10) {
                count++;
            }
            n /= 10;
        }
        System.out.println("Cea mai mare cifra este: " + celMaiMare + " si apare de " + count + " ori");
    }
}
