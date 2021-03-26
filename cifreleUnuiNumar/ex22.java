package cifreleUnuiNumar;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        //22. Se dă un număr natural n. Calculați produsul primelor două cifre ale sale
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai un numar");
        int n = scan.nextInt();
        int primul = 0;
        int aldoilea = 0;
        while (n > 9) {
            primul = n / 10;
            aldoilea = n % 10;
            n /= 10;
        }
        System.out.println("Produsul primelor doua cifre este: " + primul * aldoilea);
    }
}
