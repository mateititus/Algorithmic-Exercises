package ianuarie20repetitive;

import java.util.Scanner;

public class programFabulos {
    public static void main(String[] args) {
        // Scrieți un program fabulos care citește un număr natural nenul n și determină:
        //● suma pătratelor cifrelor lui n
        //● suma cifrelor impare ale lui n
        //● suma cifrelor divizibile cu 3 ale lui n
        //● numărul cifrelor strict mai mari decât 5
        //● produsul cifrelor nenule ale lui n
        //● suma dintre cifra cea mai puțin semnificativă (cifra unităților) lui n și cifra cea mai
        //semnificativă a lui n

        Scanner scan = new Scanner(System.in);
        System.out.println("Dai un numar care sa nu fie 0");
        int n = scan.nextInt();
        int sumaPatratelorCifrelor = 0;
        int sumaCifrelorImpare = 0;
        int sumaCifrelorDivizibileCu3 = 0;
        int numarulcifrelorstrict5 = 0;
        int produsulCifrelornenuleN = 0;
        int sumadintreUnitatiSiN = 0;
        int count = 0;
        int aux = n;

        while (n != 0) {
            sumaPatratelorCifrelor = sumaPatratelorCifrelor + (int) Math.pow(n % 10, 2);
            if (n % 10 % 2 == 1) {
                sumaCifrelorImpare += n % 10;
            }
            if ((n % 10) % 3 == 0 == true) {
                sumaCifrelorDivizibileCu3 += n % 10;
            }
            if (n % 10 > 5) {
                numarulcifrelorstrict5 += n % 10;
            }
            if ((n % 10) != 0) {
                produsulCifrelornenuleN += n % 10;
            }
            if (n >= 0 && n <= 10) {
                int primacifra = aux / (int) Math.pow(10, count);
                sumadintreUnitatiSiN = n % 10 + primacifra;
            }
            count++;
            n /= 10;
        }
        System.out.println("Suma tuturor operatilor de mai sus este: " + sumaPatratelorCifrelor + sumaCifrelorImpare + sumaCifrelorDivizibileCu3
                + numarulcifrelorstrict5 + produsulCifrelornenuleN + sumadintreUnitatiSiN);
    }
}
