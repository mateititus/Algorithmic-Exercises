package repetitive;

import java.util.Scanner;

public class sumeconsecutive {
    public static void main(String[] args) {
        // Se citesc numere de la tastatură până când se introduc două numere consecutive egale.
        // Să se determine suma tuturor numerelor citite.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai numere");
        int x = scan.nextInt();
        int ultimuNr = 0;
        int suma = 0;
        while (x!=ultimuNr){
            suma += x;
            ultimuNr = x;
            x = scan.nextInt();
        }
        System.out.println(suma);

    }
}
