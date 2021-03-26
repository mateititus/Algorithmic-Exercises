package Structuri;

import java.util.Scanner;

public class patratperrfect {
    public static void main(String[] args) {
        // Să se scrie un program care verifică dacă un număr natural citit de la tastatură este pătrat perfect.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numar");
        int x = scan.nextInt();
        int y = (int) Math.sqrt(x);
        if (x == y*y)
            System.out.println("Da");
        else
            System.out.println("Nu");
    }
}
