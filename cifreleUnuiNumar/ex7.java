package cifreleUnuiNumar;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        // 7. Să se scrie un program care să determine suma cifrelor unui număr natural citit de la tastatură.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai un numar");
        int x = scan.nextInt();
        int sum = 0;
        while (x != 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        System.out.println(sum);
    }
}
