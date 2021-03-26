package cifreleUnuiNumar;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        // 10. Să se scrie un program care să determine numărul de cifre ale unui număr natural citit de la
        //tastatură
        Scanner scan = new Scanner(System.in);
        System.out.println("Da-mi un numar");
        int n = scan.nextInt();
        System.out.println(String.valueOf(n).length());
    }
}
