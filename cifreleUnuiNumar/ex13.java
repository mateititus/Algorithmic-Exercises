package cifreleUnuiNumar;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        // Se dă un număr natural n cu cel puțin două cifre, care conține atât cifre pare cât și cifre
        //impare. Calculați produsul dintre cea mai mare cifră pară și cea mai mică cifră impară a lui n
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai un numar de cel putin 2 cifre ");
        int ceaMaiMicaCifraImpara = 0;
        int ceaMaiMareCifraPara = 0;
        int x = scan.nextInt();
        int numar = x;
        if (x < 10) {
            System.out.println("Eroare");
        } else {
            while (x != 0 && numar != 0) {
                if (x % 10 % 2 == 1 && x % 10 > ceaMaiMicaCifraImpara) {
                    ceaMaiMicaCifraImpara = x % 10;
                }
                if (numar % 10 % 2 == 0 && numar % 10 > ceaMaiMareCifraPara) {
                    ceaMaiMareCifraPara = numar % 10;
                }
                x /= 10;
                numar /= 10;
            }
            System.out.println("Produsul dintre cea mai mare cifra para si cea mai mica cifra impara a lui n este "
                    + (ceaMaiMareCifraPara * ceaMaiMicaCifraImpara));
        }
    }
}
