package ianuarie20repetitive;

import java.util.Scanner;

public class cifreleunuinumarPrimaProblemaGrea {
    public static void main(String[] args) {
        // Se dau n numere naturale. Determinaţi câte dintre ele au cifra maximă un număr impar.
        // 235 184 529 117    3
        // citesc un numar
        // gasesc cea mai mare cifra a numarului
        // verific daca cifra e impara
        // dau rezultatul
        Scanner scan = new Scanner(System.in);
        System.out.println("Cate numere vrei sa citesti ");
        int x = scan.nextInt();
        System.out.println("Ofera " + x + " numere");
        int cifraimpara = 0;
        for (int i = 1; i <= x; i++) {
            int n = scan.nextInt();
            int ceamaimare = 0;
            while (n != 0) {
                if (n % 10 > ceamaimare) {
                    ceamaimare = n % 10;
                }
                n = n / 10;
            }
            if (ceamaimare % 2 == 1) {
                cifraimpara++;
            }
        }
        System.out.println(cifraimpara);
    }
}
