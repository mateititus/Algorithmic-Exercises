package cifreleUnuiNumar;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        // Să se scrie un program care să determine ultima cifră pară a unui număr natural citit de la
        //tastatură
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera numar");
        int n = scan.nextInt();
        int cifraPara = 0;
        int found = 0;
        while (n > 0) {
            if (n % 10 % 2 == 0 && found == 0) {
                cifraPara = n % 10;
                found = -1; // sau break; si atunci fara found (se poate si cu boolean found)
            }
            n = n / 10;
        }
        System.out.println(cifraPara);
    }
}