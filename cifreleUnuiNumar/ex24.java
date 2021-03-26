package cifreleUnuiNumar;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        // 24. Se dau două numere naturale.
        // Dacă cele două numere au acelaşi număr de cifre, să se afle pe câte poziţii aceste cifre coincid
        Scanner scan = new Scanner(System.in);
        System.out.println("Da-mi primul numar");
        int primul = scan.nextInt();
        System.out.println("Da-mi al doilea numar");
        int alDoilea = scan.nextInt();
        int count = 0;
        while (primul != 0 && alDoilea != 0) {
            if (String.valueOf(primul).length() == String.valueOf(alDoilea).length()) {
                if (primul % 10 == alDoilea % 10) {
                    count++;
                }
            }
            primul /= 10;
            alDoilea /= 10;
        }
        if (String.valueOf(primul).length() != String.valueOf(alDoilea).length()) {
            System.out.println("Numerele nu au acelasi numar de cifre");
        } else
            System.out.println("Cifrele coincid pe " + count + " pozitii");
    }
}
