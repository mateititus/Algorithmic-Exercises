package repetitive;

import java.sql.SQLOutput;
import java.util.Scanner;

public class numerepare {
    public static void main(String[] args) {
        // se citesc de la tastatura nr pana se introduc 0 si cate numere pare is
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numere si incheiati cu 0");
        int x = scan.nextInt();
        int c = 0;

        while (x != 0) {
            if (x % 2 == 0)
                c++;
            x = scan.nextInt();
        }

        System.out.println(c);
    }
}


