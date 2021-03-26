package cifreleUnuiNumar;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        //25. Se citește un număr natural nenul n. Numărul n1 este format doar din cifrele pare ale lui n.
        //Numărul n2 este format doar din cifrele impare ale lui n.
        // Calculați valoarea absolută a diferenței lor
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera un numar care nu este 0");
        int n = scan.nextInt();
        int n1 = 0;
        int n2 = 0;
        int diferenta;
        int oglinditPar = 0;
        int oglinditimpar = 0;
        String rezultatn1 = "";
        String rezultatn2 = "";
        while (n != 0) {
            if (n % 10 % 2 == 0) {
                rezultatn1 += "" + n % 10;
                n1 = Integer.parseInt(rezultatn1);
            }
            if (n % 10 % 2 == 1) {
                rezultatn2 += "" + n % 10;
                n2 = Integer.parseInt(rezultatn2);
            }
            n /= 10;
        }
        while (n1 != 0) {
            oglinditPar = oglinditPar * 10 + n1 % 10;
            n1 /= 10;
        }
        while (n2 != 0) {
            oglinditimpar = oglinditimpar * 10 + n2 % 10;
            n2 /= 10;
        }
        if (oglinditimpar > oglinditPar) {
            diferenta = oglinditimpar - oglinditPar;
        } else
            diferenta = oglinditPar - oglinditimpar;
        System.out.println(Math.abs(diferenta));
    }
}



