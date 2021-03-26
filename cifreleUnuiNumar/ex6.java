package cifreleUnuiNumar;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        // Se dă un număr natural n. Determinaţi cea mai mare cifră pară a sa.
        // Dacă numărul nu are cifre pare se va afişa numărul 10.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai numar ");
        int celMaiMareNumarPar = -1;
        int x = scan.nextInt();
        while (x != 0) {
            if (x % 10 % 2 == 0 && x % 10 > celMaiMareNumarPar) {
                celMaiMareNumarPar = x % 10;
            }
            x = x / 10;
        }
        if (celMaiMareNumarPar == -1) {
            celMaiMareNumarPar = 10;
        }
        System.out.println(celMaiMareNumarPar);
    }
//    if (x%10 > ceaMaiMare){
//        ceaMaiMare = x%10;
}
