package ianuarie20repetitive;

import java.util.Scanner;

public class nNumereIntregiSuma {
    public static void main(String[] args) {
        // Se dau n numere naturale. Calculaţi suma dintre cel mai mare și cel mai mic număr dat.
        Scanner scan = new Scanner(System.in);
        System.out.println("dai numere");
        int x  = scan.nextInt();
        System.out.println("Dai  " + x + "numere");
        int n = scan.nextInt();
        int celMaiMare = 0, celMaiMic = n;
        for(int i = 1; i<x; i++){
            n  = scan.nextInt();
            if (n > celMaiMare){
                celMaiMare = n;
            }
            if (n <= celMaiMic){
                celMaiMic = n;
            }

        }
        System.out.println(celMaiMare + celMaiMic);
    }
}
