package cifreleUnuiNumar;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        //5. Se dau n numere naturale.
        // Determinaţi câte cifre pare şi câte cifre impare se află în total în cele n numere
        Scanner scan = new Scanner(System.in);
        System.out.println("Cate numere?");
        int x = scan.nextInt();
        int par = 0, impar = 0;
        for (int i = 1; i <= x; i++) {
            System.out.println("Introdu numarul " + i);
            int n = scan.nextInt();
            while (n != 0) {
                if (n % 10 % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
                n = n / 10;
            }
        }
        System.out.println("In lista de mai sus sunt " + par + " numere pare si " + impar + " numere impare");
    }
}
