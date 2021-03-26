package cifreleUnuiNumar;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        // 32. Se citește un număr natural n și o cifră c.
        // Determinați numărul obținut prin eliminarea tuturor aparițiilor cifrei c din numărul n
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai numar");
        int n = scan.nextInt();
        System.out.println("Da-mi o singura cifra");
        int c = scan.nextInt();
        String rezultat =String.valueOf(n).replace(String.valueOf(c).charAt(0),' ');
        rezultat = rezultat.replaceAll("\\s+","");
        System.out.println(rezultat);
    }
}
