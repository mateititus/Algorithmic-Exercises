package ianuarie20repetitive;

import java.util.Scanner;

public class numeresuma0 {
    public static void main(String[] args) {
        //Se citesc numere de la tastatură până la apariția lui zero. Să se determine suma lor.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai numere si incheie cu 0");
        int x = scan.nextInt();
        int suma = 0;
        while (x!=0){
            suma += x;
            x = scan.nextInt();
        }
        System.out.println(suma);
    }
}
