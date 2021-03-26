package Structuri;

import java.util.Scanner;

public class max3 {
    public static void main(String[] args) {
        //să se scrie un program care determină maximul a trei numere întregi citite de la tastatură.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati 3 numere");
        int x = scan.nextInt(), y = scan.nextInt(), z = scan.nextInt();
        if (x>y && x>z)
            System.out.println(x);
        else if (y>x && y>z)
            System.out.println(y);
        else
            System.out.println(z);

    }
}
