package cifreleUnuiNumar;

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        // 33. Se dă un număr natural n despre care știm că are număr impar de cifre.
        // Să se afișeze valoarea obținută prin eliminarea cifrei din mijloc
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera un numar");
        int numar = scan.nextInt();
        int number = numar;
        int numarNou = 0;
        int count = 0;
        int contor = 0;
        while (numar != 0) {
            count++;
            numar /= 10;
        }
        while (number != 0) {
            if (contor != count / 2) {
                numarNou = numarNou * 10 + (number % 10);
            }
            contor++;
            number /= 10;
        }
        System.out.println(numarNou);
    }
}
