package repetitive;

import java.util.Scanner;

public class tuFaInJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai un numar");
        int x = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
           System.out.println(x + " * " + i + " = " + x * i);
        }
    }
}
