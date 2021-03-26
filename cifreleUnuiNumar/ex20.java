package cifreleUnuiNumar;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        //20. Să se scrie un program care să determine suma primelor două cifre ale unui număr natural
        //citit de la tastatură
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera numar");
        int n = scan.nextInt();
        int primul = 0;
        int aldoilea = 0;
        while (n > 9) {
            primul = n / 10;
            aldoilea = n % 10;
            n /= 10;
        }
        System.out.println("Suma primelor doua cifre este: " + primul + aldoilea);
    }
}

