package cifreleUnuiNumar;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        //17. Să se scrie un program care să determine numărul de apariţii a ultimei cifre în scrierea unui
        //număr natural citit de la tastatură
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera numar");
        int n = scan.nextInt();
        int ultimulNr = n % 10;
        int ultimul = 0;
        while (n != 0) {
            if (n % 10 == ultimulNr) {
                ultimul++;
            }
            n /= 10;
        }
        System.out.println(ultimulNr + " apare de " + ultimul + " ori");
    }
}

