package cifreleUnuiNumar;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        // Să se scrie un program care să determine cea mai mare cifră a unui număr natural citit de la
        //tastatură.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai un numar");
        int n = scan.nextInt();
        int celMaiMare = 0;
        while (n != 0) {
            if (n % 10 > celMaiMare) {
                celMaiMare = n % 10;
            }
            n /= 10;
        }
        System.out.println(celMaiMare);
    }
}
