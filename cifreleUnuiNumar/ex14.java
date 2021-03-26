package cifreleUnuiNumar;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        // 14. Să se scrie un program care să determine oglinditul unui număr natural citit de la tastatură.
        //Pentru un număr dat x, considerăm următoarele noțiuni:
        //● oglinditul lui x reprezintă numărul scris cu cifrele lui x în ordine inversă;
        //● urma lui x reprezintă diferența dintre numărul format cu atâtea cifre de 9 câte cifre are x și numărul x;
        //● numărul x este curat dacă oglinditul său este egal cu urma sa. De exemplu, 27 este un număr curat.
        //● Se dau cel mult 1000 numere naturale mai mici decât 100.000.000.
        // Să se stabilească despre fiecare număr dacă este sau nu curat.
        Scanner scan = new Scanner(System.in);
        System.out.println("Cate numere?");
        int x = scan.nextInt();
        StringBuilder rezultat = new StringBuilder();
        for (int i = 1; i <= x; i++) {
            System.out.println("Introdu numarul " + i);
            int n = scan.nextInt();
            int numarSpecial = n;
            int oglindit = 0;
            int urma = 0;
            while (n != 0) {
                oglindit = oglindit * 10 + n % 10;
                urma = urma * 10 + 9;
                n /= 10;
            }
            if (urma - numarSpecial == oglindit) {
                rezultat.append("Numarul ").append(numarSpecial).append(" este curat").append("\n"); // sau += dar fara string builder
                System.out.println("Numarul " + numarSpecial + " este curat");
            } else {
                rezultat.append("Numarul ").append(numarSpecial).append(" nu este curat").append("\n");
            }
        }
        System.out.println(rezultat);
    }
}


