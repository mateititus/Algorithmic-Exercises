package cifreleUnuiNumar;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        //8. Să se scrie un program care să determine produsul cifrelor impare ale unui număr natural
        //citit de la tastatură.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai un numar");
        int x = scan.nextInt();
        int produs = 1;  //shift + f6
        while (x != 0) {
            if (x % 10 % 2 == 1) {
                produs = produs * (x % 10);
            }
            x = x / 10;
        }
        System.out.println(produs);
    }
}
