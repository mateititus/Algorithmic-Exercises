package cifreleUnuiNumar;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        //18. Să se scrie un program care să determine numărul de apariţii a primei cifre în scrierea unui
        //număr natural citit de la tastatură.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera numar");
        int n = scan.nextInt();
        int nNou = n;
        int primulNumar = 0;
        int count = 0;
        while (n > 9) {
            primulNumar = n / 10;
            n /= 10;
        }
        while (nNou != 0) {
            if (nNou % 10 == primulNumar) {
                count++;
            }
            nNou /= 10;
        }
        System.out.println(count);
    }
}
