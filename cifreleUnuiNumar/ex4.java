package cifreleUnuiNumar;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        // 4. Se dă un număr natural n. Determinaţi câte cifre are suma cifrelor sale.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera un numar");
        int n = scan.nextInt();
        int sum = 0;
        int sum2;
        int count = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        sum2 = sum;
        while (sum2 != 0) {
            ++count;
            sum2 = sum2 / 10;
        }
        System.out.println("Suma numarului este " + sum + " si are " + count + " cifre");
    }
}
