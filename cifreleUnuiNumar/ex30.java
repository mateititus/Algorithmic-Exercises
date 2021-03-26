package cifreleUnuiNumar;

import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        // 30. Pentru un număr natural dat n, numim ParImpar următoarea operație:
        //● dacă n este par, rezultatul este numărul scris cu cifrele pare ale lui n
        // – de exemplu, pentru 410722 rezultatul este 4022;
        //● dacă n este impar, rezultatul este numărul scris cu cifrele impare ale lui n
        // – de exemplu, pentru 357103 rezultatul este 35713.
        //Se citesc două numere naturale.
        // Să se determine numărul pentru care rezultatul operației ParImpar este mai mare.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera numar x");
        int x = scan.nextInt();
        int hey = x;
        System.out.println("Ofera numar y");
        int y = scan.nextInt();
        int yeh = y;
        int parImparx = 0;
        int parImpary = 0;
        if (x % 2 == 0) {
            while (x > 0) {
                if (x % 10 % 2 == 0) {
                    parImparx = parImparx * 10 + (x % 10);
                }
                x /= 10;
            }
        } else {
            while (x > 0) {
                if (x % 10 % 2 == 1) {
                    parImparx = parImparx * 10 + (x % 10);
                }
                x /= 10;
            }
        }
        if (y % 2 == 0) {
            while (y > 0) {
                if (y % 10 % 2 == 0) {
                    parImpary = parImpary * 10 + (y % 10);
                }
                y /= 10;
            }
        } else {
            while (y > 0) {
                if (y % 10 % 2 == 1) {
                    parImpary = parImpary * 10 + (y % 10);
                }
                y /= 10;
            }
        }
        if (parImparx > parImpary) {
            System.out.println(hey);
        } else
            System.out.println(yeh);
    }
}


