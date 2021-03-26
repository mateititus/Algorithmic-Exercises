package cifreleUnuiNumar;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        // Să se scrie un program care să determine cea mai mare cifră impară a unui număr natural
        //citit de la tastatură
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai numar ");
        int celMaiMareNumarImpar = 0;
        int x = scan.nextInt();
        while (x != 0) {
            if (x % 10 % 2 == 1 && x % 10 > celMaiMareNumarImpar) {
                celMaiMareNumarImpar = x % 10;
            }
            x /= 10;
        }
        if (celMaiMareNumarImpar == 0) {
            System.out.println("Programul nu are cifre impare");
        } else
            System.out.println(celMaiMareNumarImpar);
    }
}
